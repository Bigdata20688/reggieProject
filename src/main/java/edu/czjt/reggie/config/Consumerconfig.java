package edu.czjt.reggie.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
//作者：韩正
//功能：集成rabbitmq
import java.util.Map;

@Component
@RabbitListener(queues = "TestDirectQueue")
public class Consumerconfig {
    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("DirectReceiver监听到消费者添加了购物车，添加了: " + testMessage.toString());
    }

}
