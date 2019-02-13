package com.yyq.car.portal.common.util;

import org.apache.ibatis.session.RowBounds;


public class RowBoundsUtils {

	/**
	 * <p> 根据条件查询起始条件来判断是否查询位移 </p>
	 * 
	 * @param start 开始条数
	 * @param end 截止条数
	 * @return 位移对象
	 */
	public static RowBounds getRowBounds(final int start, final int end) {
		if (end <= 0) {
			// 查询总数
			return new RowBounds();
		} else {
			return new RowBounds(start - 1, end - start + 1);
		}
	}

}
