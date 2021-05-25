/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/20/2021
 *   Time: 9:27 PM
 *   File: UserService.java
 */

package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {


    private UserDao userDao;

    public UserService() {
    }

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void insertUser(User user){
        this.userDao.insertUser(user);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


}