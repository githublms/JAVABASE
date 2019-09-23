package com.example.demo2;

/**
 *  如何自定义异常类 -- 》》 我们参考 IOException 就可以实现
 *
 *  IOException中的源码如下：
 *  public class IOException extends Exception {
     static final long serialVersionUID = 7818375828146090155L;

    public IOException() {
            super();
            }

    public IOException(String message) {
            super(message);
            }

    public IOException(String message, Throwable cause) {
            super(message, cause);
            }

    public IOException(Throwable cause) {
            super(cause);
            }
        }
 *
 * 如上所示: ioexception 中的定义 ，继承Exception，提供uid ，提供重载构造器
 *
 *  因此，我们自定义异常类 ：步骤
 *      1：继承现有的异常结构，如Exception，RuntimeException
 *      2 提供全局常量   serialVersionUID
 *      3 提供自定义异常的重载构造器
 */
public class MyException extends Exception{

    static final long serialVersionUID = 78188146090155L;

    public MyException(){
        super();
    }
    public MyException(String msg){
        super(msg);
    }


}
