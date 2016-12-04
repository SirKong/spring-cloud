package com.ccnu.etrading.domain;

import java.io.Serializable;

/**
 * Created by gyb on 16/11/23.
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6987107288301953047L;

	private Long id;
	private String name;
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
