package zhongzhi_pingshen.mapper;

import zhongzhi_pingshen.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username} and password=#{password} ")
    User loginByUsernameAndPassword(User user);


}
