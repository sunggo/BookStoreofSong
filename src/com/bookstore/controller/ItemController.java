package com.bookstore.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.bean.Item;
import com.bookstore.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	@RequestMapping("/welcome")
	public String Welcome(){
		return "BookShopIndex";
	}
	
	
	@RequestMapping("/search")
	public ModelAndView search(Item  item){
		ModelAndView mav=new ModelAndView();
		
		System.out.println(item.getTitle());
		List<Item> item_list=itemService.SearchBooksByName(item);
		mav.setViewName("BookShopIndex");
		mav.addObject("list",item_list );
		return mav;
	}
	@RequestMapping("/searchList")
	public ModelAndView searchList(Item  item){
		ModelAndView mav=new ModelAndView();
		
		System.out.println(item.getTitle());
		List<Item> item_list=itemService.SearchBooksByName(item);
		mav.setViewName("item-list");
		mav.addObject("list",item_list );
		return mav;
	}
	
	@RequestMapping("/SelectByCid")
	public ModelAndView SelectByCid(Integer cid){
		System.out.println(cid);
		List<Item>iList=itemService.SelectByCid(cid);
		ModelAndView  mav=new ModelAndView();
		mav.setViewName("BookShopIndex");
		mav.addObject("list",iList);
		return mav;
		
		
	}
	@RequestMapping("OneBook")
	public ModelAndView bookDetail(Integer id){
		Item item=itemService.Load(id);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("BookDetail");
		mav.addObject("OneBook", item);
		return mav;
	}
	
	@RequestMapping("addBook.do")
	public String addBook(){
		
		return "item-add";
	}
	@RequestMapping("bookCatelog.do")
	public String bookCatelog(Model model){
		List<Item>iList=itemService.selectAll();
		model.addAttribute("list", iList);
		return "item-list";
	}
	
	@RequestMapping("item/save")
	public String itemSave(Integer cid,Integer num,String title,Long price ,String describ,MultipartFile photo) throws IllegalStateException, IOException{
		System.out.println("cat:"+cid+"num:"+num+"title:"+title+"price:"+price+"desc:"+describ);
		String path = "D:\\shangguigu\\BookStore\\WebContent\\upload";
		//获取文件名
		String realName = photo.getOriginalFilename();
		//获取后缀
		String ext = FilenameUtils.getExtension(realName);
		//生成新的文件名
		String newName = UUID.randomUUID().toString().replaceAll("-", "")+"."+ext;
		//建立一个空文件
		File file = new File(path+"/"+newName);
		//将文件写入空文件
		photo.transferTo(file);
		
		
		itemService.itemSave(cid,num,title,price ,describ,newName);
		
		return "redirect:/bookCatelog.do";
	}
	@RequestMapping("DelOneBook.do")
	public String delBook(Integer id){
		
		itemService.delBook(id);
		return "forward:/bookCatelog.do";
		
		
	}
	
	@RequestMapping("UpdateOneBook.do")
	public ModelAndView UpdateOneBook(Integer id){
		ModelAndView mav=new ModelAndView();
		mav.setViewName("item-edit");
		
		Item item=itemService.Load(id);
		mav.addObject("item",item);
		return mav;
	}
	@RequestMapping("updateForm.do")
	public String updateForm(Integer id,Integer cid,Integer num,String title,Long price ,String describ,MultipartFile photo) throws IllegalStateException, IOException{
		String path = "D:\\shangguigu\\BookStore\\WebContent\\upload";
		//获取文件名
		String realName = photo.getOriginalFilename();
		//获取后缀
		String ext = FilenameUtils.getExtension(realName);
		//生成新的文件名
		String newName = UUID.randomUUID().toString().replaceAll("-", "")+"."+ext;
		//建立一个空文件
		File file = new File(path+"/"+newName);
		//将文件写入空文件
		photo.transferTo(file);
		
		
		itemService.itemUpdadte(id,cid,num,title,price ,describ,newName);
		
		return "redirect:/bookCatelog.do";
	}
	
}
