
package com.bookstore.dao;

import com.bookstore.bean.User;

public interface UserMapper {
   
	int login(User u);
    int delete(Integer id);
    int add(User user);
    User load(Integer id);
    int update(User user);
	User loadByPassword(User u);
}