package com.uk.vo;

public class OrderDetail {
	private String orderId;
	private int goodsId;
	private float price;
	private int number;
	private int sizeId;
	private int colorId;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSizeId(){
		return sizeId;
	}
	public void setSizeId(int sizeId){
		this.sizeId=sizeId;
	}
	public int getColorId(){
		return colorId;
	}
	public void setColorId(int colorId){
		this.colorId=colorId;
	}
	

}
