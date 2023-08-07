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
public class ConditionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name="condition_id", referencedColumnName = "condition_id")
    private GraduationCondition graduationcondition;

    @Column(name = "subject_information")
    private String subjectinformation;

    @Column(name = "kind_of_condition")
    private String kindofcondition;

    @Column(name = "kind_of_subject")
    private String kindofsubject;

    @Column(name = "credit")
    private int credit;

    @Column(name = "subject_list")
    private String subjectlist;

    @Column(name = "the_number_of")
    private int thenumberof;

    @Column(name = "grade")
    private float grade;

    @Builder
    public ConditionDetail(GraduationCondition graduationcondition, String subjectinformation,
                           String kindofcondition, String kindofsubject, int credit, String subjectlist, int thenumberof,
                           float grade){
        this.graduationcondition = graduationcondition;
        this.subjectinformation = subjectinformation;
        this.kindofcondition = kindofcondition;
        this.kindofsubject = kindofsubject;
        this.credit = credit;
        this.subjectlist = subjectlist;
        this.thenumberof = thenumberof;
        this.grade = grade;
    }

}
