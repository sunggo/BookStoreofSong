package com.bookstore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.bean.Cart;
import com.bookstore.service.CartService;

@Controller
public class CartController {
@Autowired
private CartService cartService ;
	@ResponseBody
	@RequestMapping("addCart.do")
	public void addCart(Integer item_num,Integer item_id,String item_name,String cart_photo,
						HttpServletRequest request){
		
		Integer user_id=(Integer) request.getSession().getAttribute("userId");
		cartService.addCart(item_num, item_id, item_name,cart_photo,user_id);
	}
	@RequestMapping("MyCart.do")
	public ModelAndView MyCart(HttpServletRequest request ){
		
		List<Cart>cList=cartService.MyCart((Integer) request.getSession().getAttribute("userId"));
		ModelAndView mav=new ModelAndView();
		mav.setViewName("MyCart");
		mav.addObject("list", cList);
		return mav;
	}
	
	@RequestMapping("delCart.do")
	public String delCart(Integer id){
		cartService.delCart(id);
		return "forward:/MyCart.do";
	}
	
}
