/**
 * ItemMapper.java
 * 漏2006-2016 鍥涙捣鍏村攼绉戞妧鏈夐檺鍏徃 
 * All rights reserved.
 * <link>鑳栧厛鐢熶綔鍝�</link>
 * 鍒涘缓浜�: 2021-02-18 09:55:43
 **/
package com.bookstore.dao;

import java.util.List;

import com.bookstore.bean.Item;

public interface ItemMapper {
 
    int delete(Integer id);

    
    int add(Item item);

    
    Item load(Integer id);

    
    int update(Item item);
    
    List<Item> searchBooksByName(Item item);
    
    List<Item> selectByCid(Integer id);
    
    List<Item> selectAll();
    
}