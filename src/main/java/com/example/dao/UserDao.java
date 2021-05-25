/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/20/2021
 *   Time: 9:17 PM
 *   File: UserDao.java
 */

package com.example.dao;

import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao {


    private HibernateTemplate hibernateTemplate;


    public UserDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public void insertUser(User user){
        this.hibernateTemplate.save(user);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Autowired
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public UserDao() {
    }
}