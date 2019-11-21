/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019，所有权利保留。
 * <p>
 * 项目名：	rabbitmq-demo
 * 文件名：	MqSendController.java
 * 模块说明：
 * 修改历史：
 * 2019/11/21 - zhuchao - 创建。
 */
package com.enroy.rabbitmq.provider.controller;

import com.enroy.rabbitmq.commons.TestMessage;
import com.enroy.rabbitmq.commons.WebResponse;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuchao
 */
@RestController
@RequestMapping("mq")
public class MqSendController {
  @Autowired
  RabbitTemplate rabbitTemplate;

  @PostMapping("post")
  public WebResponse post(@RequestBody TestMessage message) {
    rabbitTemplate.convertAndSend("TestFanoutExchange", "", message);
    return WebResponse.newInstance(message);
  }
}
