package com.fnylad.master.Candidate.ServiceImpl;

import com.fnylad.master.Candidate.Mapper.RegisterMapper;
import com.fnylad.master.Candidate.Service.RegisterService;
import com.fnylad.master.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterMapper registerMapper;

    @Override
    public Integer candidateRegister(String phone, String password) {
        //注册user身份
        registerMapper.userRegister(phone,password);
        //获取新的用户信息
        User user = registerMapper.getNewUser(phone);
        //完成candidate身份注册
        return registerMapper.candidateRegister(user.getId());
    }

    @Override
    public Integer perfectCandidateInfo(String phone, String name, Integer sex, Date birthday) {
        return registerMapper.perfectCandidateInfo(phone,name,sex,birthday);
    }
}
