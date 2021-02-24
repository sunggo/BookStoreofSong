/**
 * Order.java
 * 漏2006-2016 鍥涙捣鍏村攼绉戞妧鏈夐檺鍏徃 
 * All rights reserved.
 * <link>鑳栧厛鐢熶綔鍝�</link>
 * 鍒涘缓浜�: 2021-02-18 09:55:43
 **/
package com.bookstore.bean;


public class Order {

    private Integer id;
    private String receivename;
    private String receiveaddress;
    private Integer receivephone;
    private Integer itemid;
    private Integer itemnum;
    private String itemname;
    private Integer totalprice;
    private String created;
    private Integer belong;
    private Integer user_id;
    

    public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	/**
     * 鑾峰彇  瀛楁:orders.id
     *
     * @return  orders.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 璁剧疆  瀛楁:orders.id
     *
     * @param id  orders.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 鑾峰彇  瀛楁:orders.receivename
     *
     * @return  orders.receivename
     */
    public String getReceivename() {
        return receivename;
    }

    /**
     * 璁剧疆  瀛楁:orders.receivename
     *
     * @param receivename  orders.receivename
     */
    public void setReceivename(String receivename) {
        this.receivename = receivename == null ? null : receivename.trim();
    }

    /**
     * 鑾峰彇  瀛楁:orders.receiveaddress
     *
     * @return  orders.receiveaddress
     */
    public String getReceiveaddress() {
        return receiveaddress;
    }

    /**
     * 璁剧疆  瀛楁:orders.receiveaddress
     *
     * @param receiveaddress  orders.receiveaddress
     */
    public void setReceiveaddress(String receiveaddress) {
        this.receiveaddress = receiveaddress == null ? null : receiveaddress.trim();
    }

    /**
     * 鑾峰彇  瀛楁:orders.receivephone
     *
     * @return  orders.receivephone
     */
    public Integer getReceivephone() {
        return receivephone;
    }

    /**
     * 璁剧疆  瀛楁:orders.receivephone
     *
     * @param receivephone  orders.receivephone
     */
    public void setReceivephone(Integer receivephone) {
        this.receivephone = receivephone;
    }

    /**
     * 鑾峰彇  瀛楁:orders.itemid
     *
     * @return  orders.itemid
     */
    public Integer getItemid() {
        return itemid;
    }

    /**
     * 璁剧疆  瀛楁:orders.itemid
     *
     * @param itemid  orders.itemid
     */
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    /**
     * 鑾峰彇  瀛楁:orders.itemnum
     *
     * @return  orders.itemnum
     */
    public Integer getItemnum() {
        return itemnum;
    }

    /**
     * 璁剧疆  瀛楁:orders.itemnum
     *
     * @param itemnum  orders.itemnum
     */
    public void setItemnum(Integer itemnum) {
        this.itemnum = itemnum;
    }

    /**
     * 鑾峰彇  瀛楁:orders.itemname
     *
     * @return  orders.itemname
     */
    public String getItemname() {
        return itemname;
    }

    /**
     * 璁剧疆  瀛楁:orders.itemname
     *
     * @param itemname  orders.itemname
     */
    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    /**
     * 鑾峰彇  瀛楁:orders.totalprice
     *
     * @return  orders.totalprice
     */
    public Integer getTotalprice() {
        return totalprice;
    }

    /**
     * 璁剧疆  瀛楁:orders.totalprice
     *
     * @param totalprice  orders.totalprice
     */
    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * 鑾峰彇  瀛楁:orders.created
     *
     * @return  orders.created
     */
    public String getCreated() {
        return created;
    }

    /**
     * 璁剧疆  瀛楁:orders.created
     *
     * @param created  orders.created
     */
    public void setCreated(String created) {
        this.created = created == null ? null : created.trim();
    }

    /**
     * 鑾峰彇  瀛楁:orders.belong
     *
     * @return  orders.belong
     */
    public Integer getBelong() {
        return belong;
    }

    /**
     * 璁剧疆  瀛楁:orders.belong
     *
     * @param belong  orders.belong
     */
    public void setBelong(Integer belong) {
        this.belong = belong;
    }
}