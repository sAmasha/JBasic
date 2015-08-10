package com.basic.modules;

public class User {
	private String name;
	private String password;
	
	
	public User(){
	}
	
	public User(String name,String password){
		this.name = name;
		this.password = password;
	}
	
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "User : name="+name+", password="+password;
	}
	

}
