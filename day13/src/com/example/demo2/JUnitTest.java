package com.example.demo2;

import java.util.Date;
import org.junit.Test;


/**
 *  java中的单元测试
 *
 *  步骤:
 *      选中项目--》》右键 builder path -->> libary -->> add libary-->> junit -->> 下一步--apply
 *      上述步骤是在项目中导入junit的jar包
 *
 *      创建一个类，要求，类是public 提供无参的构造器
 *
 *      在类中声明单元测试方法：
 *          方法要求: 方法的权限是 public 没有返回值，没有参数列表
 *          此方法上需要加入@Test 注解，并且在类中导入 import org.junit.Test;
 *          书写相关测试方法的代码体
 *      测试时，左键双击选中方法名，右键 --》Run as--》》》Junit Test
 *
 *  说明:
 *      如果执行结果没有异常，那么显示未绿条，有异常，显示红色条
 */

/**
 * 运行结果如下:
 DD
 true
 25
 show().........
 */
public class JUnitTest {

    int num = 25;
    @Test
    public void test2() {
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));

        //出现ClassCastException
//		Object obj = new String();
//		Date date = (Date)obj;
        System.out.println(num);
        show();
    }

    public void show() {
        num = 20 ;
        System.out.println("show().........");
    }

    @Test
    public void testToString() {
        String s2 = "DD";
        System.out.println(s2.toString());
    }

}
