package samsamhajyo.Backend.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ConditionResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name="student_id", referencedColumnName = "student_id")
    private StudentInfo studentInfo;

    @Column(name = "subject_information")
    private String subjectinformation;

    @Column(name = "kind_of_condition")
    private String kindofcondition;

    @Column(name = "kind_of_subject")
    private String kindofsubject;

    @Column(name = "credit")
    private int credit;

    @Column(name = "student_credit")
    private int studentcredit;

    @Column(name = "gpa")
    private double gpa;

    @Column(name = "student_gpa")
    private double studentgpa;

    @Column(name = "required_course")
    private String requiredcourse;

    @Column(name = "student_course")
    private String studentcourse;

    @Column(name = "pass_info")
    private String passinfo;

    @Builder
    public ConditionResult(StudentInfo studentInfo,String subjectinformation, String kindofcondition, String kindofsubject, int credit, int studentcredit, double gpa,
                           double studentgpa,String requiredcourse, String studentcourse, String passinfo){
        this.studentInfo = studentInfo;
        this.subjectinformation = subjectinformation;
        this.kindofcondition = kindofcondition;
        this.kindofsubject = kindofsubject;
        this.credit = credit;
        this.studentcredit = studentcredit;
        this.gpa = gpa;
        this.studentgpa = studentgpa;
        this.requiredcourse = requiredcourse;
        this.studentcourse = studentcourse;
        this.passinfo = passinfo;
    }
}
