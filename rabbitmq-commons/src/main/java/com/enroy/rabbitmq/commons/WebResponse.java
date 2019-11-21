/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019，所有权利保留。
 * <p>
 * 项目名：	rabbitmq-demo
 * 文件名：	WebResponse.java
 * 模块说明：
 * 修改历史：
 * 2019/11/21 - zhuchao - 创建。
 */
package com.enroy.rabbitmq.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhuchao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebResponse<T> implements Serializable {
  private static final long serialVersionUID = -1860066316683345669L;
  private boolean success = true;
  private int code = 0;
  private String message;
  private T data;

  public static <T> WebResponse<T> newInstance(T data) {
    WebResponse<T> res = new WebResponse();
    res.setData(data);
    return res;
  }
}
