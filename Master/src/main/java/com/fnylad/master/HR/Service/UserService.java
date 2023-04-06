package com.fnylad.master.HR.Service;

import com.fnylad.master.Entity.User;

public interface UserService {
    Integer updateAvatarById(Integer uid, String avatar);
    User getUserById(Integer uid);
}
