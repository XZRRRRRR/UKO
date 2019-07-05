package com.uk.dao;
import java.util.*;
import com.uk.vo.*;

public interface AfficheDAO {
	/*
	 * 查询网站公告
	 */
	public List<Affiche> selectAffiche()throws Exception;
	/*
	 * 按网站公告编号查询网站公告
	 */
	public Affiche selectAfficheById(int id)throws Exception;
	/*
	 * 增加网站公告
	 */
	public boolean insertAffiche(Affiche affiche)throws Exception;
	/*
	 * 删除网站公告
	 */
	public boolean deleteAfficheById(int id)throws Exception;
	/*
	 * 修改公告寿命终止时间
	 */
	public boolean changeAfficheDeathTime(String deathTime)throws Exception;
}
