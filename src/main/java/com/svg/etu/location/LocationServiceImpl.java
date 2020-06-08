package com.svg.etu.location;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("LocationService")
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public int getLocation(String sigugun) {
		LocationVO vo = sqlSessionTemplate.selectOne("getLocation", sigugun);
		int id = vo.getId();
		return id;
	}

}
