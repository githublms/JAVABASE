package com.example.exer1;

import com.example.exer.InstanceTest;

import java.util.Scanner;
import java.util.Vector;

/**
 利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
 提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。
 而向量类java.util.Vector可以根据需要动态伸缩。

 创建Vector对象：Vector v=new Vector();
 给向量添加元素：v.addElement(Object obj);   //obj必须是对象
 取出向量中的元素：Object  obj=v.elementAt(0);
 注意第一个元素的下标是0，返回值是Object类型的。
 计算向量的长度：v.size();
 若与最高分相差10分内：A等；20分内：B等；
 30分内：C等；其它：D等

 */
public class VectorTest {
    public static void main(String[] args) {

        //实例化Scanner ,用于从键盘上获取学生成绩
        Scanner scanner = new Scanner(System.in);
        //创建 Vector 对象 Vector v=new Vector();相当于原来的数组,这个数组的长度可以动态伸缩
        Vector vector = new Vector(); //这就相当于一个数组，默认常度是10
        //通过 for(;;)/ while(true) 来循环向数组中加入数据
        int maxScore = 0;
        for(;;){ // while(true){}
            System.out.println("请输入学生成绩（以负数代表输入结束）");
            int score = scanner.nextInt();
            if (score < 0){
                break;
            }
            if (score > 100 ){
                System.out.println("输入的数据非法，请重新输入");
                continue;
            }
            //向vector 中加入数组元素 5.0 以前 和 5.0 以后
            //5.0 以前
//            Integer integer = new Integer(score);
//            vector.addElement(integer);//多态
            // 5.0 以后
            vector.add(score);// 多态，自动装箱
            if (maxScore < score){//获取学生中成绩的最大值
                maxScore = score;
            }
        }

        //遍历vector 得到每个学生的成绩，并分等级
        char level;
        for (int i = 0; i < vector.size(); i++) {
            Object object = vector.elementAt(i);
            //5.0之前
//            Integer integer = (Integer) object;
//            int score = integer.intValue();
            // 5.0 之后
            int score = (Integer) object;
            if (maxScore - score <= 10){
                level = 'A';
            }else if (maxScore - score <= 20){
                level = 'B';
            }else {
                level = 'C';
            }
            System.out.println("student-" + i + " score is " + score + ",level is " + level);
        }






    }
}
