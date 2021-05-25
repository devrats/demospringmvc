/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/21/2021
 *   Time: 5:26 PM
 *   File: ByRedirectView.java
 */

package com.example.controller.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ByRedirectView {

    @RequestMapping("/ree")
    public RedirectView ree(){
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/aaa");
        System.out.println("fhd");
        return redirectView;
    }

    @RequestMapping("/aaa")
    public String aaa(){
        return "success";
    }
}