package com.uk.dao;
import java.util.*;

import com.uk.vo.Color;
public interface ColorDAO {
	/*
	 * 查询尺码
	 */
	public List<Color> selectColor()throws Exception;
	/*
	 * 通过尺码编号查询尺码
	 */
	public Color selectColorByColorId(int colorId)throws Exception;
	/*
	 * 通过尺码号查询尺码
	 */
	public Color selectColorByColorName(String color)throws Exception;
	/*
	 * 增加尺码
	 */
	public boolean insertColor(Color color)throws Exception;
	/*
	 * 删除尺码
	 */
	public boolean deleteColorByColorId(int colorId)throws Exception;
	

}
