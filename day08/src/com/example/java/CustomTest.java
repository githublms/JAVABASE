package com.example.java;

/**
 * 类中关于方法的声明和使用
 * 方法: 描述改类锁具备的功能
 * 比如：Math类中的random()，sum()方法
 *      Scanner类中的nextxx方法
 *      Arrays类中的toString()方法，sort()。。。。
 *
 *  方法的声明语法
 *     权限修饰符 返回值类型 方法名(形参列表) {
 *         方法体
 *     }
 *   注意：static ,abstract,final 修饰的方法，后面细讲
 *
 *  说明：
 *      关于权限修饰符
 *          权限修饰符有4中 public private 缺省 protected --》》 体现的是封装性，
 *          默认方法的权限修饰符先都是用 public
 *      返回值类型:
 *          有返回值:如果方法有返回值，那么在方法声明的时候，就必须指明方法的返回值类型，
 *                  同时，在方法中也应该使用return 来返回对应的变量或者常量，如 return 数据;
 *          无返回值:如果方法没有返回值，那么在方法声明的时候，返回值类型就声明为 void ，方法中就可以不返回结果，
 *                  要使用return 关键字，那么就直接return ；即可，用于结束方法
 *      方法名:注意方法名 属于标识符的范围，满足标识符的规范，最好见名知义
 *              --》》标识符：不可以数字开头，只能以字母，下划线 $ 开头
 *                          标识符中区分大小写，标识符没有长度限制
 *                          标识符中不能有空格
 *                          标识符中不可以使用关键字和保留字，但是可以包含关键字和保留字
 *
 *      形参列表:格式是 形参类型1 形参名1，形参类型2 形参名2，形参类型3 形参名3 ....
 *
 *      方法体:方法的具体实现
 *
 *  return关键字
 *      作用范围: 方法体中
 *      作用: 结束方法 和 返回对应的数据类型
 *
 *  方法中:
 *      方法中可以调用类中的属性和方法
 *      特殊的：方法A中可以重复调用方法A 称之为 递归方法
 *      方法中，不可以定义方法
 *
 */
public class CustomTest {

    public static void main(String[] args) {
        Custom custom  = new Custom();
        custom.age = 17;
        custom.eat();
        System.out.println(custom.getName());
        custom.sleep(8);
    }


}

//客户类
class Custom {

    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat (){
        System.out.println("客户吃东西");
        return ;
    }

    public void  sleep (int hour){
        System.out.println("客户一天睡" + hour + "个小时");
//        sleep(10); //递归方法，可能会造成死循环
    }

    public String getName(){
        if (age > 18 ){
            return name;
        }else{
            return  "Tom";
        }
    }
    public String getNation(String nation){
        String info = "我的国籍是:" + nation;
        return  info;
    }

    public void info (){
        //错误的：方法体中不能在定义新的方法
//        public  void info (){}
    }


}



















