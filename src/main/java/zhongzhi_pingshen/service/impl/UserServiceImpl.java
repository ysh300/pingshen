package zhongzhi_pingshen.service.impl;

import zhongzhi_pingshen.mapper.UserMapper;
import zhongzhi_pingshen.pojo.User;
import zhongzhi_pingshen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User loginByUsernameAndPassword(User user) {
        return userMapper.loginByUsernameAndPassword(user);
    }

}
