package samsamhajyo.Backend.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import samsamhajyo.Backend.springbootdeveloper.domain.ConditionDetail;
import samsamhajyo.Backend.springbootdeveloper.domain.GraduationCondition;
import samsamhajyo.Backend.springbootdeveloper.dto.*;
import samsamhajyo.Backend.springbootdeveloper.service.ConditionDetailService;
import samsamhajyo.Backend.springbootdeveloper.service.EnglishConditionService;
import samsamhajyo.Backend.springbootdeveloper.service.GraduationConditionService;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin
public class GraduationConditionController {
    private final GraduationConditionService graduationConditionService;
    private final ConditionDetailService conditionDetailService;
    private final EnglishConditionService englishConditionService;
    @PutMapping("/inputCondition")
    public String addGraduationCondition(@RequestBody AddGraduationConditionRequest request){
        //Graduation_Condition 저장
        GraduationCondition savedGraduationCondition = graduationConditionService.save(request);
        //Condition_detail 저장 작업 시작
        List<ConditionDetailRequest> conditionDetail = request.getCondition_detail();

        List<AddConditionDetailRequest> addConditionDetailRequestList = new ArrayList<>();

        for(int i = 0; i < conditionDetail.size(); i++){
            ConditionDetailRequest tmp = conditionDetail.get(i);
            AddConditionDetailRequest addConditionDetailRequest = new AddConditionDetailRequest();
            addConditionDetailRequest.setGraduation_condition(savedGraduationCondition);
            addConditionDetailRequest.setSubject_information(tmp.getSubject_information());
            addConditionDetailRequest.setKind_of_condition(tmp.getKind_of_condition());
            addConditionDetailRequest.setKind_of_subject(tmp.getKind_of_subject());
            addConditionDetailRequest.setCredit(tmp.getCredit());
            addConditionDetailRequest.setSubject_list(tmp.getSubject_list());
            addConditionDetailRequest.setThe_number_of(tmp.getThe_number_of());
            addConditionDetailRequest.setGrade(tmp.getGrade());
            addConditionDetailRequestList.add(addConditionDetailRequest);
        }

        String CD_Service = conditionDetailService.save(addConditionDetailRequestList);
        System.out.println(CD_Service);
        //Condition_detail 저장 작업 완료
        //English_Condition 저장 작업 시작
        List<EnglishConditionRequest> englishCondition = request.getEnglish_condition();

        List<AddEnglishConditionRequest> addEnglishConditionRequestList = new ArrayList<>();

        for(int i = 0; i < englishCondition.size(); i++){
            EnglishConditionRequest tmp = englishCondition.get(i);
            AddEnglishConditionRequest addEnglishConditionRequest = new AddEnglishConditionRequest();
            addEnglishConditionRequest.setGraduation_condition(savedGraduationCondition);
            addEnglishConditionRequest.setEnglish_level(tmp.getEnglish_level());
            addEnglishConditionRequest.setList_of_subject(tmp.getList_of_subject());
            addEnglishConditionRequestList.add(addEnglishConditionRequest);
        }

        String EC_Service = englishConditionService.save(addEnglishConditionRequestList);
        System.out.println(EC_Service);

        return "저장 완료";
    }
}
