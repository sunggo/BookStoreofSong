/**
 * Cart.java
 * 漏2006-2016 鍥涙捣鍏村攼绉戞妧鏈夐檺鍏徃 
 * All rights reserved.
 * <link>鑳栧厛鐢熶綔鍝�</link>
 * 鍒涘缓浜�: 2021-02-18 09:55:43
 **/
package com.bookstore.bean;

/**
 * cart 绫�
 * @Description : 
 * 
 * @author 鑳栧厛鐢�
 * @version 1.0 
 * 鏂囦欢鍒涘缓浜�: 2021-02-18 09:55:43
 **/
public class Cart {

    private Integer id;
    private Integer item_id;
    private Integer user_id;
    private String item_name;
    private Integer item_status;
    private Integer item_num;
    private String created;
    private String cart_photo;

    @Override
	public String toString() {
		return "Cart [id=" + id + ", item_id=" + item_id + ", user_id=" + user_id + ", item_name=" + item_name
				+ ", item_status=" + item_status + ", item_num=" + item_num + ", created=" + created + ", cart_photo="
				+ cart_photo + "]";
	}

	public String getCart_photo() {
		return cart_photo;
	}

	public void setCart_photo(String cart_photo) {
		this.cart_photo = cart_photo;
	}

	/**
     * 鑾峰彇  瀛楁:cart.id
     *
     * @return  cart.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 璁剧疆  瀛楁:cart.id
     *
     * @param id  cart.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 鑾峰彇  瀛楁:cart.item_id
     *
     * @return  cart.item_id
     */
    public Integer getItem_id() {
        return item_id;
    }

    /**
     * 璁剧疆  瀛楁:cart.item_id
     *
     * @param item_id  cart.item_id
     */
    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    /**
     * 鑾峰彇  瀛楁:cart.user_id
     *
     * @return  cart.user_id
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * 璁剧疆  瀛楁:cart.user_id
     *
     * @param user_id  cart.user_id
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * 鑾峰彇  瀛楁:cart.item_name
     *
     * @return  cart.item_name
     */
    public String getItem_name() {
        return item_name;
    }

    /**
     * 璁剧疆  瀛楁:cart.item_name
     *
     * @param item_name  cart.item_name
     */
    public void setItem_name(String item_name) {
        this.item_name = item_name == null ? null : item_name.trim();
    }

    /**
     * 鑾峰彇  瀛楁:cart.item_status
     *
     * @return  cart.item_status
     */
    public Integer getItem_status() {
        return item_status;
    }

    /**
     * 璁剧疆  瀛楁:cart.item_status
     *
     * @param item_status  cart.item_status
     */
    public void setItem_status(Integer item_status) {
        this.item_status = item_status;
    }

    /**
     * 鑾峰彇  瀛楁:cart.item_num
     *
     * @return  cart.item_num
     */
    public Integer getItem_num() {
        return item_num;
    }

    /**
     * 璁剧疆  瀛楁:cart.item_num
     *
     * @param item_num  cart.item_num
     */
    public void setItem_num(Integer item_num) {
        this.item_num = item_num;
    }

    /**
     * 鑾峰彇  瀛楁:cart.created
     *
     * @return  cart.created
     */
    public String getCreated() {
        return created;
    }

    /**
     * 璁剧疆  瀛楁:cart.created
     *
     * @param created  cart.created
     */
    public void setCreated(String created) {
        this.created = created == null ? null : created.trim();
    }
}