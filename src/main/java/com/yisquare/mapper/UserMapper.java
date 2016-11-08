package com.yisquare.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	
	@Select("select USERID from user where USERNAME=#{userName} and ENVIRONMENT=#{environment}")
	public Long findUserId(@Param("userName") String userName, @Param("environment") String environment);
	
	@Insert("insert into user (USERNAME, ENVIRONMENT) values (#{userName}, #{environment})")
	public int addUser(@Param("userName") String userName, @Param("environment") String environment);
	
}
