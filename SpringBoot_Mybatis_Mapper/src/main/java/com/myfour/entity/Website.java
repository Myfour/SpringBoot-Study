package com.myfour.entity;

public class Website {
	private String owner;
	private String address;
	private String webname;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebname() {
		return webname;
	}
	public void setWebname(String webname) {
		this.webname = webname;
	}
	public Website(String owner,String webname,String address) {
		this.owner=owner;
		this.address=address;
		this.webname=webname;
	}
}
