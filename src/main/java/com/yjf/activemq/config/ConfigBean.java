package com.yjf.activemq.config;


import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTempTopic;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import javax.jms.Topic;

@Component
@EnableJms
public class ConfigBean {
    @Value("${myqueue}")
    private String myqueue;

    @Bean
    public Queue queue() {
        return new ActiveMQQueue(myqueue);
    }

    @Value("${mytopic}")
    private String topicname;

    @Bean
    public Topic topic(){
        return new ActiveMQTopic(topicname);
    }

}
