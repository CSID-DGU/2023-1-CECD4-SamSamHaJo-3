package samsamhajyo.Backend.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ConditionDetailRequest {
    private String subject_information;
    private String kind_of_condition;
    private String kind_of_subject;
    private int credit;
    private String subject_list;
    private int the_number_of;
    private float grade;
}
