package com.fnylad.master.Company.Service;
import com.fnylad.master.Entity.User;

public interface CoUserService {
    Integer insertOneUser(User user);
    User getByPhone(String phone);
}
