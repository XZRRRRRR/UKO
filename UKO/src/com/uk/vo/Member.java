package com.uk.vo;

public class Member {
	private String account;//��Ա�˺�
	private String password;//��Ա����
	private String reallyName;//��ʵ����
	private String email;//����
	private String tel;//�ֻ�
	private String idCard;//����֤
	private int typeId;
	private String type;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReallyName() {
		return reallyName;
	}
	public void setReallyName(String reallyName) {
		this.reallyName = reallyName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public int getTypeId(){
		return typeId;
	}
	public void setTypeId(int typeId){
		this.typeId= typeId;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type=type;
	}
	
}