package com.example.applistsimple.model.entity;

import java.io.Serializable;

public class ProductEntity implements Serializable {

	public static final int STOCK=1;
	public static final int NOSTOCK=0;
	
	private int id;
	private String name,desc;
	private float price;
	private int photoID;
	private String photoURL;
	private int state;
	
	
	
	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductEntity(int id, String name, String desc, float price,
			int photoID, String photoURL) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.photoID = photoID;
		this.photoURL = photoURL;
	}
	public ProductEntity(int id, String name, String desc, float price,
			int photoID) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.photoID = photoID;
	}
	
	
	public ProductEntity(int id, String name, String desc, float price,
			int photoID, int state) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.photoID = photoID;
		this.state = state;
	}
	//metodos de acceso
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getPhotoID() {
		return photoID;
	}
	public void setPhotoID(int photoID) {
		this.photoID = photoID;
	}
	public String getPhotoURL() {
		return photoURL;
	}
	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
}
