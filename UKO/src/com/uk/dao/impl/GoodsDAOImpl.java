package com.uk.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.uk.dao.GoodsDAO;
import com.uk.vo.Goods;

public class GoodsDAOImpl implements GoodsDAO{
	private Connection conn = null;// �������ݿ����Ӷ���
	private PreparedStatement ps = null;// �������ݿ��������
	public GoodsDAOImpl(Connection conn) {// �������ݿ�����
		this.conn = conn;
	}
	
	/*
	 * ��ѯ������Ʒ
	 */
	public List<Goods> selectGoods() throws Exception {
		// TODO Auto-generated method stub
		List<Goods> list = new ArrayList<Goods>();
		String sql = "SELECT * FROM tb_goods ORDER BY goodsId DESC";
		this.ps = this.conn.prepareStatement(sql);
		ResultSet rs = this.ps.executeQuery();
		Goods goods = null;
		while(rs.next()){
			goods = new Goods();
			goods.setGoodsId(rs.getInt(1));
			goods.setSortId(rs.getInt(2));
			goods.setGoodName(rs.getString(3));
			goods.setIntroduce(rs.getString(4));
			goods.setBrand(rs.getString(5));
			goods.setProductdate(rs.getString(6));
			goods.setNowprice(rs.getFloat(7));
			goods.setFreeprice(rs.getFloat(8));
			goods.setPicture(rs.getString(9));
			goods.setMark(rs.getInt(10));
			list.add(goods);
		}
		this.ps.close();
		return list;
	}

	
	/*
	 * ����Ʒ��Ų�ѯ��Ʒ
	 */
	public Goods selectGoodsByGoodsId(int goodsId) throws Exception {
		// TODO Auto-generated method stub
		Goods goods = null;
		String sql = "SELECT * FROM tb_goods WHERE goodsId=?";
		this.ps = this.conn.prepareStatement(sql);
		this.ps.setInt(1, goodsId);
		ResultSet rs = this.ps.executeQuery();
		if(rs.next()){
			goods = new Goods();
			goods.setGoodsId(rs.getInt(1));
			goods.setSortId(rs.getInt(2));
			goods.setGoodName(rs.getString(3));
			goods.setIntroduce(rs.getString(4));
			goods.setBrand(rs.getString(5));
			goods.setProductdate(rs.getString(6));
			goods.setNowprice(rs.getFloat(7));
			goods.setFreeprice(rs.getFloat(8));
			goods.setPicture(rs.getString(9));
			goods.setMark(rs.getInt(10));
		}
		this.ps.close();
		return goods;
	}

	/*
	 * ������Ų�ѯ��Ʒ
	 */
	public List<Goods> selectGoodsBySortId(int sortId) throws Exception {
		// TODO Auto-generated method stub
		List<Goods> list = new ArrayList<Goods>();
		String sql = "SELECT * FROM tb_goods WHERE sortId=? ORDER BY goodsId DESC";
		this.ps = this.conn.prepareStatement(sql);
		this.ps.setInt(1, sortId);
		ResultSet rs = this.ps.executeQuery();
		Goods goods = null;
		while(rs.next()){
			goods = new Goods();
			goods.setGoodsId(rs.getInt(1));
			goods.setSortId(rs.getInt(2));
			goods.setGoodName(rs.getString(3));
			goods.setIntroduce(rs.getString(4));
			goods.setBrand(rs.getString(5));
			goods.setProductdate(rs.getString(6));
			goods.setNowprice(rs.getFloat(7));
			goods.setFreeprice(rs.getFloat(8));
			goods.setPicture(rs.getString(9));
			goods.setMark(rs.getInt(10));
			list.add(goods);
		}
		this.ps.close();
		return list;
	}

	/*
	 * ���ؼ۱�ʶ��ѯ��Ʒ
	 */
	public List<Goods> selectGoodsByMark(int mark) throws Exception {
		// TODO Auto-generated method stub
		List<Goods> list = new ArrayList<Goods>();
		String sql = "SELECT * FROM tb_goods WHERE mark=? ORDER BY goodsId DESC";
		this.ps = this.conn.prepareStatement(sql);
		this.ps.setInt(1, mark);
		ResultSet rs = this.ps.executeQuery();
		Goods goods = null;
		while(rs.next()){
			goods = new Goods();
			goods.setGoodsId(rs.getInt(1));
			goods.setSortId(rs.getInt(2));
			goods.setGoodName(rs.getString(3));
			goods.setIntroduce(rs.getString(4));
			goods.setBrand(rs.getString(5));
			goods.setProductdate(rs.getString(6));
			goods.setNowprice(rs.getFloat(7));
			goods.setFreeprice(rs.getFloat(8));
			goods.setPicture(rs.getString(9));
			goods.setMark(rs.getInt(10));
			list.add(goods);
		}
		this.ps.close();
		return list;
	}
	/*
	 * ���ؼ��ֲ�ѯ��Ʒ
	 */
	public List<Goods> selectKeywords(String keywords) throws Exception {
		// TODO Auto-generated method stub
		List<Goods> list = new ArrayList<Goods>();
		String sql = "SELECT * FROM tb_goods WHERE bookName LIKE ? OR publisher LIKE ? ORDER BY goodsId DESC";
		this.ps = this.conn.prepareStatement(sql);
		this.ps.setString(1, "%"+keywords+"%");
		this.ps.setString(2, "%"+keywords+"%");
		ResultSet rs = this.ps.executeQuery();
		Goods goods = null;
		while(rs.next()){
			goods = new Goods();
			goods.setGoodsId(rs.getInt(1));
			goods.setSortId(rs.getInt(2));
			goods.setGoodName(rs.getString(3));
			goods.setIntroduce(rs.getString(4));
			goods.setBrand(rs.getString(5));
			goods.setProductdate(rs.getString(6));
			goods.setNowprice(rs.getFloat(7));
			goods.setFreeprice(rs.getFloat(8));
			goods.setPicture(rs.getString(9));
			list.add(goods);
		}
		this.ps.close();
		return list;
	}
	/*
	 * ������Ʒ
	 */
	public boolean insertGoods(Goods goods) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "INSERT INTO tb_goods(sortId,goodName,introduce,brand,productdate,nowprice,freeprice,picture,mark) VALUES(?,?,?,?,?,?,?,?,?)";
		this.ps = this.conn.prepareStatement(sql);
		this.ps.setInt(1,goods.getSortId());
		this.ps.setString(2,goods.getGoodName());
		this.ps.setString(3,goods.getIntroduce());
		this.ps.setString(4,goods.getBrand());
		this.ps.setString(5,goods.getProductdate());
		this.ps.setFloat(6,goods.getNowprice());
		this.ps.setFloat(7,goods.getFreeprice());
		this.ps.setString(8,goods.getPicture());
		this.ps.setInt(9,0);
		if(this.ps.executeUpdate()>0){
			flag = true;
		}
		this.ps.close();
		return flag;
	}
	/*
	 * ɾ����Ʒ
	 */
	public boolean deleteGoodsByGoodsId(int goodsId) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "DELETE FROM tb_goods WHERE goodsId=?";
		this.ps = this.conn.prepareStatement(sql);
		this.ps.setInt(1,goodsId);
		if(this.ps.executeUpdate()>0){
			flag = true;
		}
		this.ps.close();
		return flag;
	}
	/*
	 * �޸���Ʒ�۸���Ϣ
	 */
	public boolean updateGoodsPrice(Goods goods) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "UPDATE tb_goods SET freeprice=?,nowprice=?,mark=? WHERE goodsId=?";
		this.ps = this.conn.prepareStatement(sql);
		this.ps.setFloat(1,goods.getFreeprice());
		this.ps.setFloat(2,goods.getNowprice());
		this.ps.setInt(3,goods.getMark());
		this.ps.setInt(4,goods.getGoodsId());
		if(this.ps.executeUpdate()>0){
			flag = true;
		}
		this.ps.close();
		return flag;
	}
	public boolean updateGoodsName(Goods goods) throws Exception{
		boolean flag = false;
		String sql="UPDATE tb_goods SET bookName=?,mark=? WHERE goodsId=?";
		this.ps=this.conn.prepareStatement(sql);
		this.ps.setString(1,goods.getGoodName());
		this.ps.setInt(2,goods.getMark());
		this.ps.setInt(3,goods.getGoodsId());
		if(this.ps.executeUpdate()>0){
			flag=true;
		}
		this.ps.close();
		return flag;
		
	}

	public boolean updateGoodsSort(Goods goods) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
}
