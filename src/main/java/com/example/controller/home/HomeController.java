/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/19/2021
 *   Time: 6:56 PM
 *   File: HomeController.java
 */

package com.example.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("hmmmmmm");
        return "home";
    }
}