package samsamhajyo.Backend.springbootdeveloper.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import samsamhajyo.Backend.springbootdeveloper.domain.ConditionResult;
import samsamhajyo.Backend.springbootdeveloper.domain.StudentInfo;
import samsamhajyo.Backend.springbootdeveloper.dto.AddConditionResultRequest;
import samsamhajyo.Backend.springbootdeveloper.repository.ConditionResultRepository;

import java.util.List;

@RequiredArgsConstructor
@Service

public class ConditionResultService {
    private final ConditionResultRepository conditionResultRepository;

    public String save(List<AddConditionResultRequest> request){
        for(int i = 0; i < request.size(); i++){
            conditionResultRepository.save(request.get(i).toEntity());
        }
        return "서비스층 작업 완료";
    }

    public List<ConditionResult> getConditionResult(StudentInfo studentInfo){
        return conditionResultRepository.findByStudentInfo(studentInfo);
    }
}
