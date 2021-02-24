package com.bookstore.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bean.Item;
import com.bookstore.bean.Order;
import com.bookstore.bean.User;
import com.bookstore.dao.ItemMapper;
import com.bookstore.dao.OrderMapper;
import com.bookstore.dao.UserMapper;

@Service
public class OrderService {
@Autowired
private OrderMapper orderMapper;
@Autowired
private UserMapper userMapper;
@Autowired
private ItemMapper itemMapper;

public List<Order> MyOrder(Integer user_id){
	return orderMapper.myOrder(user_id);
	
}



public void delOrder(Integer id,HttpServletRequest request){
	request.getSession().setAttribute("userId",1);
	Integer user_id=(Integer)request.getSession().getAttribute("userId");
	User u=userMapper.load(user_id);
	Order order=orderMapper.load(id);
	Item item=itemMapper.load(order.getItemid());
	//1.把余额加回来2.把库存加回来
	Integer newRemain=order.getTotalprice()+u.getRemain();
	Integer newNum=order.getItemnum()+item.getNum();
	u.setRemain(newRemain);
	item.setNum(newNum);
	userMapper.update(u);
	itemMapper.update(item);
	orderMapper.delete(id);
}

public int del(Integer id){
	return orderMapper.delete(id);
}

	
}
