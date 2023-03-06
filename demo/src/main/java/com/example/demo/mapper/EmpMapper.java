package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.dto.EmpDto;


@Mapper
public interface EmpMapper {

	@Select("select empno,ename,job from emp")
	public List<EmpDto> selects() throws Exception; 
	
}
