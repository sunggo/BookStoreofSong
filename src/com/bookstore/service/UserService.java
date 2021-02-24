package com.bookstore.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.bean.Item;
import com.bookstore.bean.Order;
import com.bookstore.bean.User;
import com.bookstore.dao.CartMapper;
import com.bookstore.dao.ItemMapper;
import com.bookstore.dao.OrderMapper;
import com.bookstore.dao.UserMapper;

@Service
public class UserService {
@Autowired
private UserMapper userMapper;
@Autowired
private ItemMapper itemMapper;
@Autowired
private OrderMapper orderMapper;
@Autowired
private CartMapper cartMapper;

	public boolean isValid(User u){
		int colum=userMapper.login(u);
		if(colum==0){
			return false;
		}
		else{
			return true;
		}
		
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean pay(Integer id,Integer number,Integer cart_id,HttpServletRequest request){
		//0.查询书本库存够不够
		//1.查询用户余额够不够
		//2.够的话，减库存，减余额，增加订单
		boolean flag;
		Item item=itemMapper.load(id);
		Integer num=item.getNum();
		request.getSession().setAttribute("userId",1);
		Integer user_id=(Integer)request.getSession().getAttribute("userId");
		User user=userMapper.load(user_id);
		Integer remain=user.getRemain();
		Long singlePrice= item.getPrice();
		Long total=singlePrice*number;
		if((number>num)||remain<total){
			flag=false;
		}
		else{
			flag=true;
			Integer newNum=num-number;
			Integer newRemain=(int) ((Integer)remain-total);
			//更改用户表和item表
			User u=new User();
			u.setRemain(newRemain);
			u.setId(user_id);
			Item newItem=new Item();
			newItem.setNum(newNum);
			newItem.setId(id);
			userMapper.update(u);
			itemMapper.update(newItem);
			//增加订单(查询用户)
			Order order=new Order();
			order.setReceiveaddress(user.getAddress());
			order.setReceivephone(user.getPhone());
			order.setReceivename(user.getUsername());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String creatTime=sdf.format(new Date());
			order.setCreated(creatTime);
			order.setTotalprice((int)(total-0));
			order.setItemname(item.getTitle());
			order.setItemnum(number);
			order.setItemid(item.getId());
			order.setUser_id(user_id);
			orderMapper.add(order);
			//删除购物车
			System.out.println(cart_id);
			if(cart_id!=0){
				cartMapper.delete(cart_id);
			}
		}
		
		return flag; 
	}
	
	public User load(Integer id){
		return userMapper.load(id);
	}
	
	public int update(String username,String address,Integer phone,Integer user_id){
		User u=new User();
		u.setAddress(address);
		u.setUsername(username);
		u.setPhone(phone);
		u.setId(user_id);
		return userMapper.update(u);
	}
	public User loadByPassword(User u) {
		
		return userMapper.loadByPassword(u);
	}
	
}
