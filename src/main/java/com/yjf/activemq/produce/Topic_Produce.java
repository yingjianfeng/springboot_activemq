package com.yjf.activemq.produce;

import ch.qos.logback.core.util.FixedDelay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Topic;
import java.util.UUID;

@Component
public class Topic_Produce {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private Topic topic;

    @Scheduled(
            fixedDelay = 3000
    )
    public void produceTopic(){
        jmsTemplate.convertAndSend(topic,"主题消息："+ UUID.randomUUID().toString().substring(0,6));
    }
}









