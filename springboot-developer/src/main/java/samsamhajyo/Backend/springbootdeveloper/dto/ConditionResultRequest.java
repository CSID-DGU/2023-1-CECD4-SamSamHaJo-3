package samsamhajyo.Backend.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import samsamhajyo.Backend.springbootdeveloper.domain.StudentInfo;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class ConditionResultRequest {
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
}

