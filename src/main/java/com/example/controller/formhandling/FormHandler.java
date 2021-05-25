/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/24/2021
 *   Time: 12:53 PM
 *   File: FormHandler.java
 */

package com.example.controller.formhandling;

import com.example.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormHandler {

    @RequestMapping("/form1")
    public String form1(){
        return "complexForm";
    }

    @RequestMapping(value = "/form_submit")
    public String submit(@ModelAttribute Person person, Model model) {
        System.out.println(person);
        return "success";
    }
}