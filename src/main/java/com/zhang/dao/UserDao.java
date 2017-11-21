package com.zhang.dao;


import com.zhang.domain.User;

/**
 * 功能概要：User的DAO类
 *
 * @author zhangbingwen
 * @since 2015年9月28日
 */
public interface UserDao {
    /**
     * @param userId
     * @return
     * @author zhangbingwen
     * @since 2015年9月28日
     */
    public User selectUserById(Integer userId);

}  