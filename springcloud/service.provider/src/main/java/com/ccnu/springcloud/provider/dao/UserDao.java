package com.ccnu.springcloud.provider.dao;

import com.ccnu.springcloud.provider.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

	@Select("SELECT * FROM USER WHERE NAME = #{name}")
	UserEntity findByName(@Param("name") String name);

	@Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
	Long insert(@Param("name") String name, @Param("age") Integer age);

}
