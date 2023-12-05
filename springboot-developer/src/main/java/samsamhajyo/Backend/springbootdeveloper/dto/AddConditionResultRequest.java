package samsamhajyo.Backend.springbootdeveloper.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import samsamhajyo.Backend.springbootdeveloper.domain.ConditionDetail;
import samsamhajyo.Backend.springbootdeveloper.domain.ConditionResult;
import samsamhajyo.Backend.springbootdeveloper.domain.StudentInfo;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class AddConditionResultRequest {
    private StudentInfo studentInfo;
    private String subject_information;
    private String kind_of_condition;
    private String kind_of_subject;
    private int credit;
    private int student_credit;
    private double gpa;
    private double student_gpa;
    private String required_course;
    private String student_course;
    private String pass_info;

    public ConditionResult toEntity(){
        return ConditionResult.builder()
                .studentInfo(studentInfo)
                .subjectinformation(subject_information)
                .kindofcondition(kind_of_condition)
                .kindofsubject(kind_of_subject)
                .credit(credit)
                .studentcredit(student_credit)
                .gpa(gpa)
                .studentgpa(student_gpa)
                .requiredcourse(required_course)
                .studentcourse(student_course)
                .passinfo(pass_info)
                .build();
    }
}

