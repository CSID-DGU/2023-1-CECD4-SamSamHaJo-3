package samsamhajyo.Backend.springbootdeveloper.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import samsamhajyo.Backend.springbootdeveloper.domain.*;
import samsamhajyo.Backend.springbootdeveloper.dto.*;
import samsamhajyo.Backend.springbootdeveloper.service.*;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin

public class StudentInfoResponse {
    private StudentInfo studentInfo;
    private List<ConditionResultRequest> condition_result;

    // Constructors
    public StudentInfoResponse() {
    }

    public StudentInfoResponse(StudentInfo studentInfo, List<ConditionResultRequest> condition_result) {
        this.studentInfo = studentInfo;
        this.condition_result = condition_result;
    }

    // Getters and setters
    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    public List<ConditionResultRequest> getCondition_result() {
        return condition_result;
    }

    public void setCondition_result(List<ConditionResultRequest> condition_result) {
        this.condition_result = condition_result;
    }
}

