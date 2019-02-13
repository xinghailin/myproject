/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.service.SequenceService
 * Created By: Jonathan 
 * Created on: 2014年12月9日 下午7:56:02
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyq.car.portal.common.constant.SequenceType;
import com.yyq.car.portal.common.mapper.comm.SequenceMapper;


/**
 * <P>获取序列号服务</P>
 * @author Jonathan
 */
@Service
public class SequenceService {
	@Autowired
	private SequenceMapper sequenceMapper;

	public String querySequence(SequenceType type) {
		return sequenceMapper.selectKeyByCode(type.getValue());
	}

	public Integer querySequenceValue(SequenceType type) {
		return sequenceMapper.selectSequeceValueByCode(type.getValue());
	}

}
