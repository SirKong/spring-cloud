package com.ccnu.etrading.provider.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ccnu.etrading.provider.domain.User;

@Mapper
public interface UserDao {

	@Select("SELECT * FROM USER WHERE NAME = #{name}")
	User findByName(@Param("name") String name);

	@Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
	Long insert(@Param("name") String name, @Param("age") Integer age);

}
