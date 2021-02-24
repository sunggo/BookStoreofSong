package com.bookstore.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bean.Cart;
import com.bookstore.dao.CartMapper;

@Service
public class CartService {
@Autowired
private CartMapper cartDao;

public void addCart(Integer number,Integer id,String title,String cart_photo,Integer user_id){
	Cart cart=new Cart();
	cart.setItem_id(id);
	cart.setItem_num(number);
	cart.setUser_id(user_id);
	cart.setItem_name(title);
	cart.setCart_photo(cart_photo);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String creatTime=sdf.format(new Date());
	System.out.println(cart);
	cart.setCreated(creatTime);
	cartDao.add(cart);
}
	
public List<Cart> MyCart(Integer user_id){
	return cartDao.loadAll(user_id);
}

public int delCart(Integer id){
	return cartDao.delete(id);
}

}
