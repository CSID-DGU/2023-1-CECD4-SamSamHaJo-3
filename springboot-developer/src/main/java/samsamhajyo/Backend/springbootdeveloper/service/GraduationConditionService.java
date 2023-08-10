package samsamhajyo.Backend.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import samsamhajyo.Backend.springbootdeveloper.domain.GraduationCondition;
import samsamhajyo.Backend.springbootdeveloper.dto.AddGraduationConditionRequest;
import samsamhajyo.Backend.springbootdeveloper.repository.GraduationConditionRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GraduationConditionService {
    private final GraduationConditionRepository graduationConditionRepository;

    public GraduationCondition save(AddGraduationConditionRequest request) {
        return graduationConditionRepository.save(request.toEntity());
    }
    public List<GraduationCondition> getGraduationCondition(String major, int studentnumber, String type, String course){
        return graduationConditionRepository.findByMajorAndStudentnumberAndTypeAndCourse(major, studentnumber, type, course);
    }
}
