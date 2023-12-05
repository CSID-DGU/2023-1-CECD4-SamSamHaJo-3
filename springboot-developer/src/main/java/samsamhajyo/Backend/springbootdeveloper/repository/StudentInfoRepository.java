package samsamhajyo.Backend.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samsamhajyo.Backend.springbootdeveloper.domain.StudentInfo;

import java.util.List;

public interface StudentInfoRepository extends JpaRepository<StudentInfo, Long> {
    public List<StudentInfo> findByGraduationyearAndGraduationsemesterAndStudentmajor(int graduationyear, int graduationsemester, String studentmajor);

}
