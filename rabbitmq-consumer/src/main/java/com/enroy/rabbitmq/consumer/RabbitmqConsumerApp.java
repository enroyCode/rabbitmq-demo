/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019，所有权利保留。
 * <p>
 * 项目名：	rabbitmq-demo
 * 文件名：	RabbitmqConsumerApp.java
 * 模块说明：
 * 修改历史：
 * 2019/11/21 - zhuchao - 创建。
 */
package com.enroy.rabbitmq.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhuchao
 */
@SpringBootApplication
public class RabbitmqConsumerApp {
  public static void main(String[] args) {
    SpringApplication.run(RabbitmqConsumerApp.class, args);
  }
}
