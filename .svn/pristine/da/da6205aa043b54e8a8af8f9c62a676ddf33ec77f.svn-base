package com.yyq.car.portal.common.service.async.sms;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.yyq.car.portal.common.dto.SmsEntry;
import com.yyq.car.portal.common.service.ShortMessageService;


/**
 * <P>异步发送短信</P>
 * @author Jonathan
 */
@Service
public class SmsDelegateService implements InitializingBean, ApplicationContextAware {

	private static final int ENTRIES = 1024 * 1024;

	ApplicationContext applicationContext;

	private ExecutorService executorService;

	private Disruptor<SmsEntry> disruptor;

	private RingBuffer<SmsEntry> ringBuffer;

	private ShortMessageService shortMessageService;

	final static int THREADS_NUM = 3;

	public void process(String mobileNo, Integer templateId, Map<String, String> parameters, Integer authCodeId) {
		final long sequence = ringBuffer.next();
		final SmsEntry orderEntry = ringBuffer.get(sequence);
		orderEntry.time = System.currentTimeMillis();
		orderEntry.mobileNo = mobileNo;
		orderEntry.templateId = templateId;
		orderEntry.parameters = parameters;
		orderEntry.bizObjectId = authCodeId;
		ringBuffer.publish(sequence);
	}

	public void stop() {
		disruptor.shutdown();
		executorService.shutdownNow();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if (shortMessageService == null) {
			shortMessageService = applicationContext.getBean("shortMessageService", ShortMessageService.class);
		}
		executorService = Executors.newFixedThreadPool(THREADS_NUM);
		disruptor = new Disruptor<SmsEntry>(SmsEntry.FACTORY, ENTRIES, executorService);
		disruptor.handleEventsWith(new SmsEntryHandler(shortMessageService));
		disruptor.start();
		ringBuffer = disruptor.getRingBuffer();

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

	}

}
