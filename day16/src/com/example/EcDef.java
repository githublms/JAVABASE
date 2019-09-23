package com.example;

/**
 *  自定义异常类 EcDef
 *
 */
public class EcDef  extends  Exception{

    static final long serialVersionUID = 781837582855L;

    public EcDef() {
    }

    public EcDef(String message) {
        super(message);
    }
}
