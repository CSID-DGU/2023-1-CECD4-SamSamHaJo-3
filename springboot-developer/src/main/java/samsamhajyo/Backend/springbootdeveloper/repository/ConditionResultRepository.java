package samsamhajyo.Backend.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samsamhajyo.Backend.springbootdeveloper.domain.ConditionResult;
import samsamhajyo.Backend.springbootdeveloper.domain.StudentInfo;

import java.util.List;

public interface ConditionResultRepository extends JpaRepository<ConditionResult, Long> {
    public List<ConditionResult> findByStudentInfo(StudentInfo studentInfo);
}
