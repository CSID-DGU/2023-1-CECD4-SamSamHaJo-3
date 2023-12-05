package samsamhajyo.Backend.springbootdeveloper.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import samsamhajyo.Backend.springbootdeveloper.domain.StudentInfo;
import samsamhajyo.Backend.springbootdeveloper.domain.ConditionResult;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class AddStudentInfoRequest {
    private int graduation_year;
    private int graduation_semester;
    private String student_major;
    private int student_code;
    private String student_name;
    private String student_course;
    private String student_type;
    private String student_graduation;
    private String student_document;
    private List<ConditionResultRequest> condition_result;

    public StudentInfo toEntity(){
        return StudentInfo.builder()
                .graduationyear(graduation_year)
                .graduationsemester(graduation_semester)
                .studentmajor(student_major)
                .studentcode(student_code)
                .studentname(student_name)
                .studentcourse(student_course)
                .studenttype(student_type)
                .studentgraduation(student_graduation)
                .studentdocument(student_document)
                .build();
    }

}

