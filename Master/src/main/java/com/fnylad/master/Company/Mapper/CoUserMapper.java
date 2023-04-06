package com.fnylad.master.Company.Mapper;

import com.fnylad.master.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CoUserMapper {
    Integer insertOneUser(User user);
    User getByPhone(String phone);
}
