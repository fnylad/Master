package com.fnylad.master.Company.Controller;

import com.fnylad.master.Entity.User;
import com.fnylad.master.Company.Service.CoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoUserController {
    @Autowired
    private CoUserService coUserService;

    @RequestMapping("/company/list/insertUser")
    public User insertUser(@RequestBody User user){
        coUserService.insertOneUser(user);
        return coUserService.getByPhone(user.getPhone());
    }
}
