package com.zhang.service;
  
import org.springframework.stereotype.Service;  
  
import com.zhang.domain.User;
  
/** 
 * 功能概要：UserService接口类 
 *  
 * @author zhangbingwen
 * @since  2015年9月28日  
 */  
public interface UserService {  
    User selectUserById(Integer userId);  
  
}  