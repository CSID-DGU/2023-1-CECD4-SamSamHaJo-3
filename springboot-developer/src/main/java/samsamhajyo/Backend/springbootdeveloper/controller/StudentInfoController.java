package samsamhajyo.Backend.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import samsamhajyo.Backend.springbootdeveloper.domain.*;
import samsamhajyo.Backend.springbootdeveloper.dto.*;
import samsamhajyo.Backend.springbootdeveloper.service.*;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin


public class StudentInfoController {
    private final StudentInfoService studentInfoService;
    private final ConditionResultService conditionResultService;

    @PutMapping("/inputMultipleStudents")
    public String addMultipleStudentInfo(@RequestBody AddMultipleStudentInfoRequest request) {
        List<String> resultMessages = new ArrayList<>();

        for (AddStudentInfoRequest studentInfoRequest : request.getStudentInfoList()) {
            StudentInfo savedStudentInfo = studentInfoService.save(studentInfoRequest);

            List<ConditionResultRequest> conditionResult = studentInfoRequest.getCondition_result();
            List<AddConditionResultRequest> addConditionResultRequestList = new ArrayList<>();

            for (ConditionResultRequest tmp : conditionResult) {
                AddConditionResultRequest addConditionResultRequest = new AddConditionResultRequest();
                addConditionResultRequest.setStudentInfo(savedStudentInfo);
                addConditionResultRequest.setSubject_information(tmp.getSubject_information());
                addConditionResultRequest.setKind_of_condition(tmp.getKind_of_condition());
                addConditionResultRequest.setKind_of_subject(tmp.getKind_of_subject());
                addConditionResultRequest.setCredit(tmp.getCredit());
                addConditionResultRequest.setStudent_credit(tmp.getStudent_credit());
                addConditionResultRequest.setGpa(tmp.getGpa());
                addConditionResultRequest.setStudent_gpa(tmp.getStudent_gpa());
                addConditionResultRequest.setRequired_course(tmp.getRequired_course());
                addConditionResultRequest.setStudent_course(tmp.getStudent_course());
                addConditionResultRequest.setPass_info(tmp.getPass_info());
                addConditionResultRequestList.add(addConditionResultRequest);
            }

            String CD_Service = conditionResultService.save(addConditionResultRequestList);
            resultMessages.add(CD_Service);
        }

        System.out.println(resultMessages);
        return "저장 완료";
    }

    @GetMapping("/getStudent/{graduationyear}/{graduationsemester}/{studentmajor}")
    public List<StudentInfoResponse> getStudentInfo(@PathVariable("graduationyear") int graduationyear,
                                                    @PathVariable("graduationsemester") int graduationsemester,
                                                    @PathVariable("studentmajor") String studentmajor) {

        List<StudentInfo> studentInfoList = studentInfoService.getStudentInfo(graduationyear, graduationsemester, studentmajor);
        List<StudentInfoResponse> studentInfoResponseList = new ArrayList<>();

        for (StudentInfo studentInfo : studentInfoList) {
            List<ConditionResult> conditionResults = conditionResultService.getConditionResult(studentInfo);

            StudentInfoResponse studentInfoResponse = new StudentInfoResponse();
            studentInfoResponse.setStudentInfo(studentInfo);
            List<ConditionResultRequest> conditionResultList = new ArrayList<>();

            for (ConditionResult conditionResult : conditionResults) {
                ConditionResultRequest conditionResultRequest = new ConditionResultRequest();
                conditionResultRequest.setSubject_information(conditionResult.getSubjectinformation());
                conditionResultRequest.setKind_of_condition(conditionResult.getKindofcondition());
                conditionResultRequest.setKind_of_subject(conditionResult.getKindofsubject());
                conditionResultRequest.setCredit(conditionResult.getCredit());
                conditionResultRequest.setStudent_credit(conditionResult.getStudentcredit());
                conditionResultRequest.setGpa(conditionResult.getGpa());
                conditionResultRequest.setStudent_gpa(conditionResult.getStudentgpa());
                conditionResultRequest.setRequired_course(conditionResult.getRequiredcourse());
                conditionResultRequest.setStudent_course(conditionResult.getStudentcourse());
                conditionResultRequest.setPass_info(conditionResult.getPassinfo());

                conditionResultList.add(conditionResultRequest);
            }

            studentInfoResponse.setCondition_result(conditionResultList);
            studentInfoResponseList.add(studentInfoResponse);
        }

        return studentInfoResponseList;
    }

}
