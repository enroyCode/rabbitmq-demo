/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019，所有权利保留。
 * <p>
 * 项目名：	rabbitmq-demo
 * 文件名：	RabbitmqReceiver.java
 * 模块说明：
 * 修改历史：
 * 2019/11/21 - zhuchao - 创建。
 */
package com.enroy.rabbitmq.consumer.mq;

import com.enroy.rabbitmq.commons.TestMessage;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author zhuchao
 */
@Slf4j
@Component
@RabbitListener(queues = "TestFanoutQueue")//监听的队列名称 TestDirectQueue
public class RabbitmqReceiver {
  @RabbitHandler
  public void process(@Payload TestMessage testMessage, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag, Channel channel) throws IOException {
    log.info("DirectReceiver消费者收到消息  : " + testMessage.toString());
//    channel.basicReject(deliveryTag, true);//为true会重新放回队列
  }
}
