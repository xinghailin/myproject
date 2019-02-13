package com.yyq.car.portal.common.service.async.sms;

import org.ufa.log.Logger;
import org.ufa.log.LoggerFactory;

import com.lmax.disruptor.EventHandler;
import com.yyq.car.portal.common.constant.SmsStatus;
import com.yyq.car.portal.common.dto.SmsDeliveryResult;
import com.yyq.car.portal.common.dto.SmsEntry;
import com.yyq.car.portal.common.service.ShortMessageService;


/**
 * <P> TODO </P>
 * 
 * @author Jonathan
 */
public class SmsEntryHandler implements EventHandler<SmsEntry> {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	private ShortMessageService shortMessageService;

	public SmsEntryHandler(ShortMessageService shortMessageService) {
		this.shortMessageService = shortMessageService;
	}

	@Override
	public void onEvent(final SmsEntry smsEntry, final long sequence, final boolean endOfBatch) {
		logger.info("开始发送短信请求 --- 序列号:{}, 手机号:{}, 模板ID：{}", sequence, smsEntry.mobileNo, smsEntry.templateId);
		try {
			SmsDeliveryResult result = shortMessageService.sendShortMessage(smsEntry.parameters, smsEntry.mobileNo, smsEntry.templateId, smsEntry.bizObjectId);
			if (SmsStatus.SUBMIT.getValue() != result.getStatus()) {
				logger.debug("发送短信提交失败");
			}
			logger.info("发送短信成功--- 序列号:{}, 手机号:{}, 模板ID：{}", sequence, smsEntry.mobileNo, smsEntry.templateId);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("发送短信请求处理异常 --- 序列号:{}, 耗时:{}, 异常信息:{}", sequence, (System.currentTimeMillis() - smsEntry.time), e.getMessage());
		}

	}

}
