package samsamhajyo.Backend.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "user_position", nullable = false)
    private String userposition;

    @Column(name = "user_department", nullable = false)
    private String userdepartment;

    @Column(name = "user_majordepartment")
    private String usermajordepartment;

    @Column(name = "user_number", nullable = false)
    private String usernumber;

    @Column(name = "user_name", nullable = false)
    private String username;

    @Column(name = "user_email", nullable = false)
    private String useremail;

    @Column(name = "user_id", nullable = false)
    private String userid;

    @Column(name = "user_password", nullable = false)
    private String userpassword;

    @Column(name = "permission")
    private String permission;
    @Builder
    public UserInfo(String userposition, String userdepartment, String usermajordepartment, String usernumber, String username, String useremail, String userid, String userpassword, String permission){
        this.userposition = userposition;
        this.userdepartment = userdepartment;
        this.usermajordepartment = usermajordepartment;
        this.usernumber = usernumber;
        this.username = username;
        this.useremail = useremail;
        this.userid = userid;
        this.userpassword = userpassword;
        this.permission = permission;
    }

    public String getPermission(){
        return this.permission;
    }

    public void setPermission(String permission) {
        this.permission=permission;
    }
}
