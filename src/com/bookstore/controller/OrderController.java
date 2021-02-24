package com.bookstore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.bean.Item;
import com.bookstore.bean.Order;
import com.bookstore.bean.User;
import com.bookstore.service.ItemService;
import com.bookstore.service.OrderService;
import com.bookstore.service.UserService;

@Controller
public class OrderController {
@Autowired
private OrderService orderService;

	@RequestMapping("MyOrder.do")
	public ModelAndView MyOrder(HttpServletRequest request){
		
		Integer user_id=(Integer)request.getSession().getAttribute("userId");
		List<Order>oList=orderService.MyOrder(user_id);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("MyOrder");
		mav.addObject("list",oList);
		return mav;
		
	}
	@RequestMapping("delOrder.do")
	public String delOrder(Integer id,HttpServletRequest request){
		orderService.delOrder(id, request);
		return "forward:/MyOrder.do";
	}
	
	@RequestMapping("del.do")
	public String del(Integer id){
		orderService.del(id);
		return "forward:/MyOrder.do";
	}
	
	
}
