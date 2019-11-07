package com.yjf.activemq.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.UUID;

@Component
public class Queue_Produce {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private Queue queue;


    public void produceMsg(){
        jmsTemplate.convertAndSend(queue,"****:"+ UUID.randomUUID().toString().substring(0,6));
    }

    @Scheduled(fixedDelay = 3000)
    public void produceMsgScheduled(){
        jmsTemplate.convertAndSend(queue,"****:"+ UUID.randomUUID().toString().substring(0,6));
        System.out.println("*******ok");
    }

}
