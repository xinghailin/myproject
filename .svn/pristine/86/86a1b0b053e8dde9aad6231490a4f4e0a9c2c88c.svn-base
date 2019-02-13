package com.yyq.car.portal.common.service.async.sms;

import java.util.List;

import org.ufa.log.Logger;
import org.ufa.log.LoggerFactory;

import com.lmax.disruptor.EventHandler;
import com.yyq.car.portal.common.constant.SmsStatus;
import com.yyq.car.portal.common.dto.FSmsEntry;
import com.yyq.car.portal.common.dto.SmsDeliveryResult;
import com.yyq.car.portal.common.service.ShortMessageService;

/**
 * <P>群发短信，无需模板</P>
 * @author nj
 */
public class BatchSmsSendHandler implements EventHandler<FSmsEntry> {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	private ShortMessageService shortMessageService;

	public BatchSmsSendHandler(ShortMessageService shortMessageService) {
		this.shortMessageService = shortMessageService;
	}

	@Override
	public void onEvent(final FSmsEntry smsEntry, final long sequence, final boolean endOfBatch) {
		logger.info("开始发送短信请求 --- 序列号:{}, 手机号:{}, 模板ID：{}", sequence, smsEntry.mobileMap, smsEntry.templateId);
		try {
			List<SmsDeliveryResult> resultList = shortMessageService.sendShortMessage(smsEntry.mobileList,smsEntry.content);
			for (SmsDeliveryResult result : resultList) {
				if (SmsStatus.SUBMIT.getValue() != result.getStatus()) {
					logger.debug("群发短信失败" + result.getResultMessage());
				}
			}
			logger.info("群发短信成功--- 序列号:{}, 手机号:{}, 模板ID：{}", sequence, smsEntry.mobileList, smsEntry.templateId);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("发送短信请求处理异常 --- 序列号:{}, 耗时:{}, 异常信息:{}", sequence, (System.currentTimeMillis() - smsEntry.time), e.getMessage());
		}

	}
}
