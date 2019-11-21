/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019，所有权利保留。
 * <p>
 * 项目名：	rabbitmq-demo
 * 文件名：	RabbitAdminConfig.java
 * 模块说明：
 * 修改历史：
 * 2019/11/21 - zhuchao - 创建。
 */
package com.enroy.rabbitmq.consumer.config;

import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhuchao
 */
@Configuration
public class RabbitAdminConfig {
  @Bean
  public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory) {
    RabbitAdmin rabbitAdmin = new RabbitAdmin(connectionFactory);
    FanoutExchange testFanoutExchange = new FanoutExchange("TestFanoutExchange", true, false);
    rabbitAdmin.declareExchange(testFanoutExchange);
    Queue testFanoutQueue = new Queue("TestFanoutQueue", true);
    rabbitAdmin.declareQueue(testFanoutQueue);
    rabbitAdmin.declareBinding(BindingBuilder.bind(testFanoutQueue).to(testFanoutExchange));
    return rabbitAdmin;
  }

  @Bean
  public MessageConverter messageConverter() {
    return new Jackson2JsonMessageConverter();
  }
}
