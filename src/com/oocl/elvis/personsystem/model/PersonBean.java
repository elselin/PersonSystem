package com.oocl.elvis.personsystem.model;

public class PersonBean {
	private int id;
	private String name;
	private boolean sex;
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
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
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
		// TODO Auto-generated constructor stub
		
	}
	
	public PersonBean(int id, String name, boolean sex, String birth, String address, String tele) {
		this.setId(id);
		this.setName(name);
		this.setSex(sex);
		this.setBirth(birth);
		this.setAddress(address);
		this.setTele(tele);		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String sexTra;
		if(sex){
			sexTra = "Female";
		}else{
			sexTra = "Male";
		}
		return this.id+"\t"+this.name+"\t"+sexTra+"\t"+this.birth+"\t"+this.address+"\t"+this.tele;
	}
	
}
