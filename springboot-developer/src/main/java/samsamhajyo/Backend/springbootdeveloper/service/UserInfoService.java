package samsamhajyo.Backend.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import samsamhajyo.Backend.springbootdeveloper.domain.UserInfo;
import samsamhajyo.Backend.springbootdeveloper.dto.AddUserInfoRequest;
import samsamhajyo.Backend.springbootdeveloper.repository.UserInfoRepository;

import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserInfoService {
    private final UserInfoRepository userInfoRepository;

    public UserInfo save(AddUserInfoRequest request){
        return userInfoRepository.save(request.toEntity());
    }
    public List<UserInfo> getByNumber(AddUserInfoRequest request) { return userInfoRepository.findByUsernumber(request.getuser_number()); }
    public List<UserInfo> getById(AddUserInfoRequest request) { return userInfoRepository.findByUserid(request.getuser_id());}
    public List<UserInfo> getByIdAndPassword(String id, String password){ return userInfoRepository.findByUseridAndUserpassword(id, password);}
    public List<UserInfo> findAll() {
        return userInfoRepository.findAll();
    }
    public boolean updateAdminPermission(String userid) {
        List<UserInfo> userInfoList = userInfoRepository.findByUserid(userid);

        if (!userInfoList.isEmpty()) {
            UserInfo userInfo = userInfoList.get(0);
            userInfo.setPermission("Y");
            userInfoRepository.save(userInfo);
            return true;
        }

        return false;
    }
}
