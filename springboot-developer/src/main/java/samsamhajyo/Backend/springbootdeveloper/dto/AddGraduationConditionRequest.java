package samsamhajyo.Backend.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import samsamhajyo.Backend.springbootdeveloper.domain.ConditionDetail;
import samsamhajyo.Backend.springbootdeveloper.domain.EnglishCondition;
import samsamhajyo.Backend.springbootdeveloper.domain.GraduationCondition;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddGraduationConditionRequest {

    private String major;
    private int student_number;
    private String type;
    private String course;
    private List<ConditionDetailRequest> condition_detail;
    private List<EnglishConditionRequest> english_condition;

    public GraduationCondition toEntity(){
        return GraduationCondition.builder()
                .major(major)
                .studentnumber(student_number)
                .type(type)
                .course(course)
                .build();
    }

}
