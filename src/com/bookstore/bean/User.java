/**
 * User.java
 * ©2006-2016 四海兴唐科技有限公司 
 * All rights reserved.
 * <link>胖先生作品</link>
 * 创建于: 2021-02-18 09:55:43
 **/
package com.bookstore.bean;

/**
 * tb_user 类
 * @Description : 
 * 
 * @author 胖先生
 * @version 1.0 
 * 文件创建于: 2021-02-18 09:55:43
 **/
public class User {

    private Integer id;
    private String account;
    private String username;
    private String password;
    private String address;
    private Integer phone;
    private String birth;
    private Integer remain;
    private Integer identify;
    private Integer fk_roleId;

    /**
     * 获取  字段:tb_user.id
     *
     * @return  tb_user.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:tb_user.id
     *
     * @param id  tb_user.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取  字段:tb_user.account
     *
     * @return  tb_user.account
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置  字段:tb_user.account
     *
     * @param account  tb_user.account
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取  字段:tb_user.username
     *
     * @return  tb_user.username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置  字段:tb_user.username
     *
     * @param username  tb_user.username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取  字段:tb_user.password
     *
     * @return  tb_user.password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置  字段:tb_user.password
     *
     * @param password  tb_user.password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取  字段:tb_user.address
     *
     * @return  tb_user.address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置  字段:tb_user.address
     *
     * @param address  tb_user.address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取  字段:tb_user.phone
     *
     * @return  tb_user.phone
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * 设置  字段:tb_user.phone
     *
     * @param phone  tb_user.phone
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * 获取  字段:tb_user.birth
     *
     * @return  tb_user.birth
     */
    public String getBirth() {
        return birth;
    }

    /**
     * 设置  字段:tb_user.birth
     *
     * @param birth  tb_user.birth
     */
    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    /**
     * 获取  字段:tb_user.remain
     *
     * @return  tb_user.remain
     */
    public Integer getRemain() {
        return remain;
    }

    /**
     * 设置  字段:tb_user.remain
     *
     * @param remain  tb_user.remain
     */
    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    /**
     * 获取  字段:tb_user.identify
     *
     * @return  tb_user.identify
     */
    public Integer getIdentify() {
        return identify;
    }

    /**
     * 设置  字段:tb_user.identify
     *
     * @param identify  tb_user.identify
     */
    public void setIdentify(Integer identify) {
        this.identify = identify;
    }

    /**
     * 获取  字段:tb_user.fk_roleId
     *
     * @return  tb_user.fk_roleId
     */
    public Integer getFk_roleId() {
        return fk_roleId;
    }

    /**
     * 设置  字段:tb_user.fk_roleId
     *
     * @param fk_roleId  tb_user.fk_roleId
     */
    public void setFk_roleId(Integer fk_roleId) {
        this.fk_roleId = fk_roleId;
    }
}