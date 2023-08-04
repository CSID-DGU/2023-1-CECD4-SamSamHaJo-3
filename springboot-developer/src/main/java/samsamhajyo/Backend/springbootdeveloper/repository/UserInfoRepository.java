package samsamhajyo.Backend.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samsamhajyo.Backend.springbootdeveloper.domain.UserInfo;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    public List<UserInfo> findByUsernumber(String usernumber);
    public List<UserInfo> findByUserid(String id);
    public List<UserInfo> findByUseridAndUserpassword(String id, String password);
}
