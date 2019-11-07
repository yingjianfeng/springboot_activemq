package com.yjf;

import com.yjf.activemq.produce.Queue_Produce;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private Queue_Produce queue_produce;

    @Test
    public void contextLoads() throws Exception{
        queue_produce.produceMsg();
    }

}
