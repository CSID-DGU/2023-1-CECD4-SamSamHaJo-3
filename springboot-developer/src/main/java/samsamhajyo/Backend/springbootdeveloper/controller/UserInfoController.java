package samsamhajyo.Backend.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import samsamhajyo.Backend.springbootdeveloper.domain.UserInfo;
import samsamhajyo.Backend.springbootdeveloper.dto.AddUserInfoRequest;
import samsamhajyo.Backend.springbootdeveloper.service.UserInfoService;

import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin
public class UserInfoController {

    private final UserInfoService userInfoService;

    @PostMapping("/registration")
    public String addUserInfo(@RequestBody AddUserInfoRequest request){
        List<UserInfo> getByNumber = userInfoService.getByNumber(request);
        if(!getByNumber.isEmpty()){
            return "중복된 교번입니다";
        }
        List<UserInfo> getById = userInfoService.getById(request);
        if (!getById.isEmpty()){
            return "중복된 ID입니다";
        }
        UserInfo savedUserInfo = userInfoService.save(request);

        return "저장 완료";
    }
    @GetMapping("/login/{userid}/{userpassword}")
    public String login(@PathVariable("userid") String userid, @PathVariable ("userpassword") String userpassword){
        List<UserInfo> getById = userInfoService.getByIdAndPassword(userid, userpassword);
        if(getById.isEmpty()) {
            return "ID와 비밀번호가 올바르지 않습니다";
        }
        if(getById.get(0).getPermission().equals("N")){
            return "허가되지 않은 ID입니다";
        }

        return "로그인 완료";
    }
}
