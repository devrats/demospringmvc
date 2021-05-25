/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/20/2021
 *   Time: 8:25 PM
 *   File: UsingModelAndView.java
 */

package com.example.controller.controllertomodeldata;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsingModelAndView {

    @RequestMapping("/showmydetails")
    public ModelAndView showMyDetails(){
        ModelAndView modelAndView = new ModelAndView();
        User user  = new User(01,"devvrat","abc",8532066858L);
        modelAndView.addObject("user",user);
        modelAndView.setViewName("showmydetails");
        return modelAndView;
    }
}