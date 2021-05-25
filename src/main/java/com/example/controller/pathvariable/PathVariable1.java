/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/24/2021
 *   Time: 5:59 PM
 *   File: PathVariable1.java
 */

package com.example.controller.pathvariable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariable1 {

    @RequestMapping("/hmmm/{id}")
    public String hmmm(@PathVariable("id") int id) {
        System.out.println(id);
        return "success";
    }
}