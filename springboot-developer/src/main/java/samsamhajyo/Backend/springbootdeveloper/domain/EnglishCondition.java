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
public class EnglishCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "condition_id", referencedColumnName = "condition_id")
    private GraduationCondition graduationcondition;

    @Column(name = "english_level")
    private String englishlevel;

    @Column(name = "list_of_subject")
    private String listofsubject;

    @Builder
    public EnglishCondition(GraduationCondition graduationcondition, String englishlevel, String listofsubject){
        this.graduationcondition = graduationcondition;
        this.englishlevel = englishlevel;
        this.listofsubject = listofsubject;
    }


}
