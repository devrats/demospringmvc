/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/21/2021
 *   Time: 5:26 PM
 *   File: ByRedirectPrefix.java
 */

package com.example.controller.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ByRedirectPrefix {

    @RequestMapping("/re")
    public String re(){
        return "redirect:/aa";
    }

    @RequestMapping("/aa")
    public String aa(){
        return "success";
    }
}

