package com.fnylad.master.HR.ServiceImpl;

import com.fnylad.master.Entity.User;
import com.fnylad.master.HR.Mapper.UserMapper;
import com.fnylad.master.HR.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public Integer updateAvatarById(Integer uid, String avatar) {

        return userMapper.updateAvatarById(uid,avatar);
    }

    @Override
    public User getUserById(Integer uid) {
        return userMapper.getUserById(uid);
    }
}
