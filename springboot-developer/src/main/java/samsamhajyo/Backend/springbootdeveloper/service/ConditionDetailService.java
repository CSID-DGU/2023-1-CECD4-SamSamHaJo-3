package samsamhajyo.Backend.springbootdeveloper.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import samsamhajyo.Backend.springbootdeveloper.domain.ConditionDetail;
import samsamhajyo.Backend.springbootdeveloper.dto.AddConditionDetailRequest;
import samsamhajyo.Backend.springbootdeveloper.repository.ConditionDetailRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ConditionDetailService {
    private final ConditionDetailRepository conditionDetailRepository;

    public String save(List<AddConditionDetailRequest> request){
        for(int i = 0; i < request.size(); i++){
            conditionDetailRepository.save(request.get(i).toEntity());
        }
        return "서비스층 작업 완료";
    }
}
