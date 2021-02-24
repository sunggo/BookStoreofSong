
package com.bookstore.dao;

import java.util.List;

import com.bookstore.bean.Order;

public interface OrderMapper {
    
    int delete(Integer id);

    int add(Order order);

   
    Order load(Integer id);

   
    int update(Order order);
    
    List<Order> myOrder(Integer id);
}