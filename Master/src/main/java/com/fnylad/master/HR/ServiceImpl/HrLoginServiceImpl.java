package com.fnylad.master.HR.ServiceImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fnylad.master.Entity.User;
import com.fnylad.master.HR.Mapper.HrLoginMapper;
import com.fnylad.master.HR.Service.HrLoginService;
import com.fnylad.master.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class HrLoginServiceImpl implements HrLoginService {
    @Autowired
    private HrLoginMapper hrLoginMapper;

    @Override
    public String hrLogin(String phone, String password) throws JsonProcessingException {
        User user = hrLoginMapper.hrLogin(phone);
        if(user!=null){
            if(password.equals(user.getPassword())){
                String token= TokenUtil.sign(user);
                HashMap<String,Object> hs=new HashMap<>();
                hs.put("token",token);
                ObjectMapper objectMapper=new ObjectMapper();
                return objectMapper.writeValueAsString(hs);
            }else{
                return "账号或密码错误";
            }
        }else{
            return "用户不存在";
        }
    }

    @Override
    public User getHrInfo(String phone) {
        return hrLoginMapper.hrLogin(phone);
    }
}
