package com.oocl.elvis.personsystem.model;

public class PersonBean {
	private int id;
	private String name;
	private String sex;
	private String birth;
	private String address;
	private String tele;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	
	public PersonBean() {
		
		
	}
	
	public PersonBean(int id, String name, String sex, String birth, String address, String tele) {
		this.setId(id);
		this.setName(name);
		this.setSex(sex);
		this.setBirth(birth);
		this.setAddress(address);
		this.setTele(tele);		
	}
	
	
	public String toString() {	
		return this.id+"\t"+this.name+"\t"+sex+"\t"+this.birth+"\t"+this.address+"\t"+this.tele;
	}
		
}
