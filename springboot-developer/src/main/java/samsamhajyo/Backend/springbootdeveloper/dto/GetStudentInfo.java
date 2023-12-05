package samsamhajyo.Backend.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import samsamhajyo.Backend.springbootdeveloper.domain.ConditionResult;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GetStudentInfo {
    List<ConditionResultRequest> condition_result;
}
