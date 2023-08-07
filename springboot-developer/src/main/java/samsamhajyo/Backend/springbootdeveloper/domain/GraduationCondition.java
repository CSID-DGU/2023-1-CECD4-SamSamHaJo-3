package samsamhajyo.Backend.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GraduationCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "condition_id", updatable = false)
    private Long conditionid;

    @Column(name = "major", nullable = false)
    private String major;

    @Column(name = "student_number", nullable = false)
    private int studentnumber;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "course", nullable = false)
    private String course;

    @Builder
    public GraduationCondition(String major, int studentnumber, String type, String course){
        this.major = major;
        this.studentnumber = studentnumber;
        this.type = type;
        this.course = course;
    }

}
