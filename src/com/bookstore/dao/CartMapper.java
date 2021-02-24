package com.bookstore.dao;

import java.util.List;

import com.bookstore.bean.Cart;

public interface CartMapper {
    
    int delete(Integer id);

   
    int add(Cart cart);

    Cart load(Integer id);

  
    int update(Cart cart);
    
    List<Cart> loadAll(Integer user_id);
}