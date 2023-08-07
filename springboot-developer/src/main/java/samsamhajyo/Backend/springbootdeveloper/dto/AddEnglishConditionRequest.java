package samsamhajyo.Backend.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import samsamhajyo.Backend.springbootdeveloper.domain.EnglishCondition;
import samsamhajyo.Backend.springbootdeveloper.domain.GraduationCondition;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddEnglishConditionRequest {
    private GraduationCondition graduation_condition;
    private String english_level;
    private String list_of_subject;

    public EnglishCondition toEntity(){
        return EnglishCondition.builder()
                .graduationcondition(graduation_condition)
                .englishlevel(english_level)
                .listofsubject(list_of_subject)
                .build();
    }
}
