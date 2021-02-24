package com.bookstore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.bean.User;
import com.bookstore.service.UserService;

@Controller
public class UserController {
@Autowired	
private UserService userService;	
	
@RequestMapping("/login")
public String loginJsp(){
	return "forward:/login.jsp";
	
}
	@RequestMapping("/loginDo")
	public String login(User u,HttpServletRequest request){
		//判断数据库中有无此用户
		if(userService.isValid(u)==true){
			User user=userService.loadByPassword(u);
			request.getSession().setAttribute("roleId",user.getFk_roleId());
			request.getSession().setAttribute("userId",user.getId());
			return "BookShopIndex";
		}else{
			request.setAttribute("usercheck", "用户名或密码错误");
			return "forward:/login.jsp";
		}
		
	}
	@Transactional(propagation=Propagation.REQUIRED)
	@ResponseBody
	@RequestMapping("user/pay.do")
	public String pay(@RequestParam("id")Integer id,@RequestParam("number")Integer number,
						@RequestParam("cart_id")Integer cart_id,
						HttpServletRequest request){
		
		//1.
		boolean flag=userService.pay(id, number,cart_id, request);
		if(flag==true){
			return "purchase succeed!";
		}else{
			return "purchase failed!";
		}
		
		
	
	}
	
	@RequestMapping("userInfo.do")
	public ModelAndView userInfo(HttpServletRequest request){
	
		Integer user_id=(Integer)request.getSession().getAttribute("userId");
		User u=userService.load(user_id);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("userInfo");
		mav.addObject("user", u);
		return mav;
	}
	@ResponseBody
	@RequestMapping("userInfoUpdate.do")
	public ModelAndView userInfoUpdate(String username,String address,Integer phone,HttpServletRequest request){
		System.out.println(username+":"+address+":"+phone);
		
		Integer user_id=(Integer)request.getSession().getAttribute("userId");
		userService.update(username, address, phone,user_id);
		return userInfo(request);
	}
	
}
