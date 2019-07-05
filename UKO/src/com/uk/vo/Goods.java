package com.uk.vo;

public class Goods {
	private int goodsId;
	private int sortId;
	private String GoodName;
	private String introduce;
	private String brand;
	private String productdate;
	private float nowprice;
	private float freeprice;
	private String picture;
	private int mark;
	
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public int getSortId() {
		return sortId;
	}
	public void setSortId(int sortId) {
		this.sortId = sortId;
	}
	public String getGoodName() {
		return GoodName;
	}
	public void setGoodName(String goodName) {
		GoodName = goodName;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProductdate() {
		return productdate;
	}
	public void setProductdate(String productdate) {
		this.productdate = productdate;
	}
	public float getNowprice() {
		return nowprice;
	}
	public void setNowprice(float nowprice) {
		this.nowprice = nowprice;
	}
	public float getFreeprice() {
		return freeprice;
	}
	public void setFreeprice(float freeprice) {
		this.freeprice = freeprice;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
