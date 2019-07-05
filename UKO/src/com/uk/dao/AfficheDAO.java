package com.uk.dao;
import java.util.*;
import com.uk.vo.*;

public interface AfficheDAO {
	/*
	 * ��ѯ��վ����
	 */
	public List<Affiche> selectAffiche()throws Exception;
	/*
	 * ����վ�����Ų�ѯ��վ����
	 */
	public Affiche selectAfficheById(int id)throws Exception;
	/*
	 * ������վ����
	 */
	public boolean insertAffiche(Affiche affiche)throws Exception;
	/*
	 * ɾ����վ����
	 */
	public boolean deleteAfficheById(int id)throws Exception;
	/*
	 * �޸Ĺ���������ֹʱ��
	 */
	public boolean changeAfficheDeathTime(String deathTime)throws Exception;
}
