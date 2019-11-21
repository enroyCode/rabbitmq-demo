/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019，所有权利保留。
 * <p>
 * 项目名：	rabbitmq-demo
 * 文件名：	TestMessage.java
 * 模块说明：
 * 修改历史：
 * 2019/11/21 - zhuchao - 创建。
 */
package com.enroy.rabbitmq.commons;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhuchao
 */
@Data
public class TestMessage implements Serializable {
  private static final long serialVersionUID = 7524538673688628519L;
  private String message;
}
