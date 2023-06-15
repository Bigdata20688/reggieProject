package edu.czjt.reggie.common;


/**
 * 姓名：李硕
 * 内容：异常类模块
 */
/**
 * 自定义业务异常类
 */
public class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }
}
