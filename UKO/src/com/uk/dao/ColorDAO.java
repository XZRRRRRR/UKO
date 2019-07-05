package com.uk.dao;
import java.util.*;

import com.uk.vo.Color;
public interface ColorDAO {
	/*
	 * ��ѯ����
	 */
	public List<Color> selectColor()throws Exception;
	/*
	 * ͨ�������Ų�ѯ����
	 */
	public Color selectColorByColorId(int colorId)throws Exception;
	/*
	 * ͨ������Ų�ѯ����
	 */
	public Color selectColorByColorName(String color)throws Exception;
	/*
	 * ���ӳ���
	 */
	public boolean insertColor(Color color)throws Exception;
	/*
	 * ɾ������
	 */
	public boolean deleteColorByColorId(int colorId)throws Exception;
	

}
