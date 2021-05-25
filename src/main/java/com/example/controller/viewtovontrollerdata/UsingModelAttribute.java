/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/20/2021
 *   Time: 10:17 PM
 *   File: UsingModelAttribute.java
 */

package com.example.controller.viewtovontrollerdata;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsingModelAttribute {

    @RequestMapping("/submit1")
    public String submit(@ModelAttribute User user, BindingResult result){
        if(result.hasErrors()){
            System.out.println(result.getAllErrors());
            return "form";
        }
        System.out.println(user);
        return "success";
    }
}