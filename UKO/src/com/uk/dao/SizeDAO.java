package com.uk.dao;

import java.util.List;
import com.uk.vo.Size;

public interface SizeDAO {
	/*
	 * 查询尺码
	 */
	public List<Size> selectSize()throws Exception;
	/*
	 * 通过尺码编号查询尺码
	 */
	public Size selectSizeBySizeId(int sizeId)throws Exception;
	/*
	 * 通过尺码号查询尺码
	 */
	public Size selectSizeBySizeName(String size)throws Exception;
	/*
	 * 增加尺码
	 */
	public boolean insertSize(Size size)throws Exception;
	/*
	 * 删除尺码
	 */
	public boolean deleteSizeBySizeId(int sizeId)throws Exception;
	

}
