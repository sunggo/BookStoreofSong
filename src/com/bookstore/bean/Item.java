/**
 * Item.java
 * 漏2006-2016 鍥涙捣鍏村攼绉戞妧鏈夐檺鍏徃 
 * All rights reserved.
 * <link>鑳栧厛鐢熶綔鍝�</link>
 * 鍒涘缓浜�: 2021-02-18 09:55:43
 **/
package com.bookstore.bean;

public class Item {

    private Integer id;
    private String title;
    private Integer cid;
    private Long price;
    private Integer num;
    private Integer status;
    private String it_created;
    private String updated;
    private String photo;
    private String describ;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
    public Integer getCid() {
        return cid;
    }
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }
    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIt_created() {
        return it_created;
    }

   
    public void setIt_created(String it_created) {
        this.it_created = it_created == null ? null : it_created.trim();
    }

    
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated == null ? null : updated.trim();
    }

    public String getPhoto() {
        return photo;
    }

    
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

   
    public String getDescrib() {
        return describ;
    }

    public void setDescrib(String describ) {
        this.describ = describ == null ? null : describ.trim();
    }
}