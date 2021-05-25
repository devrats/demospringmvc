/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/20/2021
 *   Time: 10:22 PM
 *   File: Orm.java
 */

package com.example.controller.orm;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Orm {

    ApplicationContext context;
    UserService userService;

    public UserService getUserService() {
        return userService;
    }


    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public Orm() {
    }

    public Orm(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/submit2")
    public String submit(@ModelAttribute User user, Model model) {
        System.out.println(user);
        context = new ClassPathXmlApplicationContext("spring.xml");
        userService = context.getBean("service",UserService.class);
        this.userService.insertUser(user);
        return "success";
    }
}