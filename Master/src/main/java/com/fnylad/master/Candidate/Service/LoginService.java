package com.fnylad.master.Candidate.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fnylad.master.Entity.User;

public interface LoginService {
    //求职者登录
    String candidateLogin(String phone,String password) throws JsonProcessingException;
    //获取用户信息
    User getUserInfo(String phone);
}
