package samsamhajyo.Backend.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samsamhajyo.Backend.springbootdeveloper.domain.EnglishCondition;
import samsamhajyo.Backend.springbootdeveloper.domain.GraduationCondition;

import java.util.List;

public interface EnglishConditionRepository extends JpaRepository<EnglishCondition, Long> {
    public List<EnglishCondition> findByGraduationcondition(GraduationCondition graduationcondition);
}
