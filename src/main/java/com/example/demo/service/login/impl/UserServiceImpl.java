package com.example.demo.service.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.login.UserDao;
import com.example.demo.entity.login.UserEntity;
import com.example.demo.service.login.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	/**
	 * 
	* <p>Title: 用户登录</p>  
	* <p>Description: </p>  
	* @param user
	* @return  
	* @see com.example.demo.service.login.UserService#findUserLogin(com.example.demo.entity.login.UserEntity)
	 */
	@Override
	public UserEntity findUserLogin(UserEntity user) {
		return userDao.findUserLogin(user);
	}
	/**
	 * 
	* <p>Title: 新增用户</p>  
	* <p>Description: </p>  
	* @param user
	* @return  
	* @see com.example.demo.service.login.UserService#insertUser(com.example.demo.entity.login.UserEntity)
	 */
	@Override
	public int insertUser(UserEntity user) {
		return userDao.insertUser(user);
	}
	/**
	 * 
	* <p>Title: 新增微信用户</p>  
	* <p>Description: </p>  
	* @param user
	* @return  
	* @see com.example.demo.service.login.UserService#insertWXUser(com.example.demo.entity.login.UserEntity)
	 */
	@Override
	public int insertWXUser(UserEntity user) {
		return userDao.insertWXUser(user);
	}

}
