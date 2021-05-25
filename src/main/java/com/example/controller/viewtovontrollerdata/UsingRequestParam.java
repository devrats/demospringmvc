/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/20/2021
 *   Time: 9:40 PM
 *   File: UsingRequestParam.java
 */

package com.example.controller.viewtovontrollerdata;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class UsingRequestParam {


    @RequestMapping("/form")
    public String form(){
        return "form";
    }

    @RequestMapping(value = "/submit",method = RequestMethod.GET)
    public String submit(@RequestParam(name = "name") String name,
                         @RequestParam(name = "password") String password,
                         @RequestParam(name = "phone") long phone){
        User user = new User(name,password,phone);
        System.out.println(user);
        return "success";
    }
}