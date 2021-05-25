/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/20/2021
 *   Time: 7:52 PM
 *   File: UsingModel.java
 */

package com.example.controller.controllertomodeldata;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsingModel {

    @RequestMapping("/showmyname")
    public String showMyName(Model model){
        model.addAttribute("name","devvrat");
        model.addAttribute("roll",45);
        model.addAttribute("course","B.tech");
        return "showmyname";
    }
}