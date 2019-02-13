package com.yyq.car.portal.common.dto;

import java.util.ArrayList;
import java.util.List;


/**
 * <P>TODO</P>
 * @author Jonathan
 */
public class QueryResultDTO<T> {
	private Long totalRecord;
	private List<T> result = new ArrayList<T>();

	/**
	 * @return the totalRecord
	 */
	public Long getTotalRecord() {
		return totalRecord;
	}

	/**
	 * @param totalRecord the totalRecord to set
	 */
	public void setTotalRecord(Long totalRecord) {
		this.totalRecord = totalRecord;
	}

	/**
	 * @return the result
	 */
	public List<T> getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(List<T> result) {
		this.result = result;
	}
	/**
	 * @return the filePath
	 */

}
