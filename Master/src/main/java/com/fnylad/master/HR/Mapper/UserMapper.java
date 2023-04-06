package com.fnylad.master.HR.Mapper;
import com.fnylad.master.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    Integer updateAvatarById(Integer uid,String avatar);
    User getUserById(Integer uid);
}
