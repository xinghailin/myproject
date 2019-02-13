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
import com.yyq.car.portal.common.dto.FSmsEntry;
import com.yyq.car.portal.common.dto.SmsEntry;
import com.yyq.car.portal.common.service.ShortMessageService;
 
@Service
public class  BatchSmsDelegateService implements InitializingBean, ApplicationContextAware {
	
	private static final int ENTRIES = 1024;
    
	ApplicationContext applicationContext;
    
	private ExecutorService executorService;
    
	private Disruptor<FSmsEntry> disruptor;
    
	private RingBuffer<FSmsEntry> ringBuffer;
    
	private ShortMessageService shortMessageService;
	
	final static int THREADS_NUM=3;
    
	public void process(Integer templateId,Map<String,Map<String, String>> mobileMap) {
		final long sequence = ringBuffer.next();
		final FSmsEntry smsEntry = ringBuffer.get(sequence);
       
		smsEntry.time = System.currentTimeMillis();
		smsEntry.templateId = templateId ;
		smsEntry.mobileMap = mobileMap ;
		ringBuffer.publish(sequence);
	}
    
	public void stop() {
		disruptor.shutdown();
		executorService.shutdownNow();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if (shortMessageService == null) {
			shortMessageService=applicationContext.getBean("shortMessageService", ShortMessageService.class);
		}
		executorService = Executors.newFixedThreadPool(THREADS_NUM);
		disruptor = new Disruptor<FSmsEntry>(FSmsEntry.FACTORY, ENTRIES, executorService);
		disruptor.handleEventsWith(new BatchSmsEntryHandler(shortMessageService));
		disruptor.start();
		ringBuffer = disruptor.getRingBuffer();
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

	}

}
