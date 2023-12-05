package samsamhajyo.Backend.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StudentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", updatable = false)
    private Long studentid;

    @Column(name = "graduation_year", nullable = false)
    private int graduationyear;

    @Column(name = "graduation_semester", nullable = false)
    private int graduationsemester;

    @Column(name = "student_major", nullable = false)
    private String studentmajor;

    @Column(name = "student_code", nullable = false)
    private int studentcode;

    @Column(name = "student_name", nullable = false)
    private String studentname;

    @Column(name = "student_course", nullable = false)
    private String studentcourse;

    @Column(name = "student_type", nullable = false)
    private String studenttype;

    @Column(name = "student_graduation", nullable = false)
    private String studentgraduation;

    @Column(name = "student_document", nullable = false)
    private String studentdocument;

    @Builder
    public StudentInfo(int graduationyear, int graduationsemester, String studentmajor, int studentcode, String studentname, String studentcourse, String studenttype, String studentgraduation, String studentdocument){
        this.graduationyear = graduationyear;
        this.graduationsemester = graduationsemester;
        this.studentmajor = studentmajor;
        this.studentcode = studentcode;
        this.studentname = studentname;
        this.studentcourse = studentcourse;
        this.studenttype = studenttype;
        this.studentgraduation = studentgraduation;
        this.studentdocument = studentdocument;
    }


}






