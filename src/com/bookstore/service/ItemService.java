package com.bookstore.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bean.Item;
import com.bookstore.dao.ItemMapper;

@Service
public class ItemService {
@Autowired
private ItemMapper itemMapper;
	public List<Item> SearchBooksByName(Item item){
	
		return 	itemMapper.searchBooksByName(item);
		
		
	}
	
	public List<Item> SelectByCid(Integer cid){
		return itemMapper.selectByCid(cid);
		
		
	}
	
	public Item Load(Integer id){
		return itemMapper.load(id);
	}
	
	public int itemSave(Integer cid,Integer num,String title,Long price ,String describ,String photo){
		Item item=new Item ();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String creatTime=sdf.format(new Date());
		item.setIt_created(creatTime);
		item.setCid(cid);
		item.setDescrib(describ);
		item.setNum(num);
		item.setPhoto(photo);
		item.setPrice(price);
		item.setTitle(title);
		return itemMapper.add(item);
		
	}
	public List<Item> selectAll(){
		
		return 	itemMapper.selectAll();
		
		
	}
	
	public int delBook(Integer id){
		return itemMapper.delete(id);
		
		
	}

	public int itemUpdadte(Integer id,Integer cid, Integer num, String title, Long price, String describ, String photo) {
		Item item=new Item ();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String creatTime=sdf.format(new Date());
		item.setId(id);
		item.setIt_created(creatTime);
		item.setCid(cid);
		item.setDescrib(describ);
		item.setNum(num);
		item.setPhoto(photo);
		item.setPrice(price);
		item.setTitle(title);
		return itemMapper.update(item);
		
	}
	
}
