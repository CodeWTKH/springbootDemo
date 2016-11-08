package com.yisquare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yisquare.domain.User;
import com.yisquare.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	public Long getUserId(User user) {
		return userMapper.findUserId(user.getUserName(), user.getEnvironment());
	}
}
