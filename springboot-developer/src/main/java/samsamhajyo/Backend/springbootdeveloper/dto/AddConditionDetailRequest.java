package samsamhajyo.Backend.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import samsamhajyo.Backend.springbootdeveloper.domain.ConditionDetail;
import samsamhajyo.Backend.springbootdeveloper.domain.GraduationCondition;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddConditionDetailRequest {
    private GraduationCondition graduation_condition;
    private String subject_information;
    private String kind_of_condition;
    private String kind_of_subject;
    private int credit;
    private String subject_list;
    private int the_number_of;
    private float grade;

    public ConditionDetail toEntity(){
        return ConditionDetail.builder()
                .graduationcondition(graduation_condition)
                .subjectinformation(subject_information)
                .kindofcondition(kind_of_condition)
                .kindofsubject(kind_of_subject)
                .credit(credit)
                .subjectlist(subject_list)
                .thenumberof(the_number_of)
                .grade(grade)
                .build();
    }
}
