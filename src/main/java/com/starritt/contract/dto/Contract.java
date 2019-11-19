package com.starritt.contract.dto;

public class Contract {
	
	@Override
	public String toString() {
		return "Contract [name=" + name + ", id=" + id + "]";
	}
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
