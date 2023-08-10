package samsamhajyo.Backend.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samsamhajyo.Backend.springbootdeveloper.domain.GraduationCondition;

import java.util.List;

public interface GraduationConditionRepository extends JpaRepository<GraduationCondition, Long> {
    public List<GraduationCondition> findByMajorAndStudentnumberAndTypeAndCourse(String major, int studentnumber, String type,
                                                                                 String course);
}
