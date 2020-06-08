package com.svg.etu.user;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<UserVO> getUserList() {
		System.out.println("----------[getUserList 함수 호출]----------");
		List<UserVO> userList = sqlSessionTemplate.selectList("getUserList"); 
		return userList;
	}
	
	
}
