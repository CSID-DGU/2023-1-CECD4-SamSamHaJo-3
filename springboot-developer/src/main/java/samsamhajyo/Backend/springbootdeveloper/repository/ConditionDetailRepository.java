package samsamhajyo.Backend.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samsamhajyo.Backend.springbootdeveloper.domain.ConditionDetail;
import samsamhajyo.Backend.springbootdeveloper.domain.GraduationCondition;

import java.util.List;

public interface ConditionDetailRepository extends JpaRepository<ConditionDetail, Long> {
    public List<ConditionDetail> findByGraduationcondition(GraduationCondition graduationcondition);
}
