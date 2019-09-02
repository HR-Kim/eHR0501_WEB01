package kr.co.ehr.user.service;

import kr.co.ehr.cmn.DTO;

public class UserVO extends DTO {
	private String name;
	private String sex;
	private String tel;
	private String age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserVO [name=" + name + ", sex=" + sex + ", tel=" + tel + ", age=" + age + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
