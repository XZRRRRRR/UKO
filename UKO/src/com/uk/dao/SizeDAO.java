package com.uk.dao;

import java.util.List;
import com.uk.vo.Size;

public interface SizeDAO {
	/*
	 * ��ѯ����
	 */
	public List<Size> selectSize()throws Exception;
	/*
	 * ͨ�������Ų�ѯ����
	 */
	public Size selectSizeBySizeId(int sizeId)throws Exception;
	/*
	 * ͨ������Ų�ѯ����
	 */
	public Size selectSizeBySizeName(String size)throws Exception;
	/*
	 * ���ӳ���
	 */
	public boolean insertSize(Size size)throws Exception;
	/*
	 * ɾ������
	 */
	public boolean deleteSizeBySizeId(int sizeId)throws Exception;
	

}
