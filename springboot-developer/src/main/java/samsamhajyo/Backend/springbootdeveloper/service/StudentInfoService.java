package samsamhajyo.Backend.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import samsamhajyo.Backend.springbootdeveloper.domain.StudentInfo;
import samsamhajyo.Backend.springbootdeveloper.domain.UserInfo;
import samsamhajyo.Backend.springbootdeveloper.dto.AddStudentInfoRequest;
import samsamhajyo.Backend.springbootdeveloper.repository.StudentInfoRepository;

import java.util.List;
@RequiredArgsConstructor
@Service

public class StudentInfoService {
    private final StudentInfoRepository studentInfoRepository;

    public StudentInfo save(AddStudentInfoRequest request) {
        return studentInfoRepository.save(request.toEntity());
    }
    public List<StudentInfo> getStudentInfo(int graduationyear, int graduationsemester, String studentmajor){
        return studentInfoRepository.findByGraduationyearAndGraduationsemesterAndStudentmajor(graduationyear, graduationsemester, studentmajor);
    }
}
