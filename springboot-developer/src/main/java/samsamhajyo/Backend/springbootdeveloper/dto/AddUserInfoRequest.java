package samsamhajyo.Backend.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;
import samsamhajyo.Backend.springbootdeveloper.domain.UserInfo;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddUserInfoRequest {

    private String user_position;
    private String user_department;
    private String user_majordepartment;
    private String user_number;
    private String user_name;
    private String user_email;
    private String user_id;
    private String user_password;
    private String permission;

    public UserInfo toEntity(){
        return UserInfo.builder()
                .userposition(user_position)
                .userdepartment(user_department)
                .usermajordepartment(user_majordepartment)
                .usernumber(user_number)
                .username(user_name)
                .useremail(user_email)
                .userid(user_id)
                .userpassword(user_password)
                .permission(permission)
                .build();
    }
    public String getuser_number(){
        return this.user_number;

    }
    public String getuser_id(){
        return this.user_id;
    }
}
