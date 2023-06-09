package com.fnylad.master.HR.Mapper;

import com.fnylad.master.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HrLoginMapper {

    //查找是否有该求职者账户
    @Select("select * from user where phone = #{phone}")
    User hrLogin(String phone);
}
