package samsamhajyo.Backend.springbootdeveloper.service;

import lombok.*;
import org.springframework.stereotype.Service;
import samsamhajyo.Backend.springbootdeveloper.domain.EnglishCondition;
import samsamhajyo.Backend.springbootdeveloper.dto.AddEnglishConditionRequest;
import samsamhajyo.Backend.springbootdeveloper.dto.EnglishConditionRequest;
import samsamhajyo.Backend.springbootdeveloper.repository.EnglishConditionRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EnglishConditionService {
    private final EnglishConditionRepository englishConditionRepository;

    public String save(List<AddEnglishConditionRequest> request){
        for(int i = 0; i< request.size(); i++){
            englishConditionRepository.save(request.get(i).toEntity());
        }
        return "영어 조건 서비스 완료";
    }
}
