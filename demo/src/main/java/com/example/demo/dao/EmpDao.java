package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.EmpDto;
import com.example.demo.mapper.EmpMapper;

//import org.apache.ibatis.annotations.Mapper;

@Repository
public class EmpDao {

	@Autowired
	private SqlSessionFactory  sqlSessionFactory;
	
	public List<EmpDto> selects() throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			return sqlSession.getMapper(EmpMapper.class).selects();
			
		}finally {
			sqlSession.close();
		}
		
	}
	
}
