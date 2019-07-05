package com.uk.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.uk.dao.AfficheDAO;
import com.uk.vo.Affiche;

public class AfficheDAOImpl implements AfficheDAO{
	private Connection conn = null;// 定义数据库连接对象
	private PreparedStatement ps = null;// 定义数据库操作对象

	public AfficheDAOImpl(Connection conn) {// 设置数据库连接
		this.conn = conn;
	}
	
	/*
	 * 查询网站公告
	 */
	public List<Affiche> selectAffiche() throws Exception {
		// TODO Auto-generated method stub
		List<Affiche> list = new ArrayList<Affiche>();
		String sql = "SELECT * FROM tb_affiche ORDER BY id DESC";
		this.ps = this.conn.prepareStatement(sql);
		ResultSet rs = this.ps.executeQuery();
		Affiche affiche = null;
		while(rs.next()){
			affiche = new Affiche();
			affiche.setId(rs.getInt(1));
			affiche.setAffiche(rs.getString(2));
			affiche.setContent(rs.getString(3));
			affiche.setCreaTime(rs.getString(4));
			affiche.setDeathTime(rs.getString(5));
			list.add(affiche);
		}
		this.ps.close();
		return list;
	}

	
	/*
	 * 按网站公告编号查询网站公告
	 */
	public Affiche selectAfficheById(int id) throws Exception {
		// TODO Auto-generated method stub
		Affiche affiche = null;
		String sql = "SELECT * FROM tb_affiche WHERE id=?";
		this.ps = this.conn.prepareStatement(sql);
		this.ps.setInt(1, id);
		ResultSet rs = this.ps.executeQuery();
		if(rs.next()){
			affiche = new Affiche();
			affiche.setId(rs.getInt(1));
			affiche.setAffiche(rs.getString(2));
			affiche.setContent(rs.getString(3));
			affiche.setCreaTime(rs.getString(4));
			affiche.setDeathTime(rs.getString(5));
		}
		this.ps.close();
		return affiche;
	}

	
	/*
	 * 增加网站公告
	 */
	public boolean insertAffiche(Affiche affiche) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "INSERT INTO tb_affiche(affiche,content,creaTime) VALUES(?,?,now())";
		this.ps = this.conn.prepareStatement(sql);
		this.ps.setString(1,affiche.getAffiche());
		this.ps.setString(2,affiche.getContent());
		if(this.ps.executeUpdate()>0){
			flag = true;
		}
		this.ps.close();
		return flag;
	}

	
	/*
	 * 删除网站公告
	 */
	public boolean deleteAfficheById(int id) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "DELETE FROM tb_affiche WHERE id=?";
		this.ps = this.conn.prepareStatement(sql);
		this.ps.setInt(1, id);
		if(this.ps.executeUpdate()>0){
			flag = true;
		}
		this.ps.close();
		return flag;
	}
	/*
	 * 更改公告寿命时间
	 * @see com.uk.dao.AfficheDAO#changeAfficheDeathTime(java.lang.String)
	 */
	public boolean changeAfficheDeathTime(Affiche affiche) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "UPDATE FROM tb_affiche SET deathTime=? WHERE id=?";
		this.ps = this.conn.prepareStatement(sql);
		this.ps.setString(1,affiche.getDeathTime());
		this.ps.setInt(2,affiche.getId());
		if(this.ps.executeUpdate()>0){
			flag = true;
		}
		this.ps.close();
		return flag;
	}

	public boolean changeAfficheDeathTime(String deathTime) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
