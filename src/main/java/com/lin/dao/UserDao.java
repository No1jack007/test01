package com.lin.dao;


import com.lin.domain.User;

/**
 * 功能概要：User的DAO类
 *
 * @author linbingwen
 * @since 2015年9月28日
 */
public interface UserDao {
    /**
     * @param userId
     * @return
     * @author linbingwen
     * @since 2015年9月28日
     */
    public User selectUserById(Integer userId);

}  