package com.example.demo;

/**
 * while 循环结构
 *     1 初始化条件
 *     2 循环条件
 *     3 循环体
 *     4 迭代条件
 * ①
 * while(②){
 *     ③
 *     ④
 * }
 *
 * 执行顺序：1234,234,234....
 *
 * 说明:
 *      写while循环的时候，一定要注意循环条件和迭代条件，不要丢了迭代条件，否则会容易造成死循环
 *      我们写程序的时候，我们要避免出现死循环
 *   for循环和while循环是可以相互转换的
 *         区别：for循环和while循环的初始化条件的作用范围不同
 *
 *
 *
 */
public class WhileTest {

    public static void main(String[] args) {
        //遍历100 以内的偶数
        int i = 0 ;
        while (i <= 100){
            if (i % 2 == 0 ){
                System.out.println(i);
            }
            i++;
        }
        //出了循环体后，仍然可以使用变量 i
        System.out.println("最后的结果是:" + i);

        int j = 0 ;
        for (; j <= 100; j++) { //编译报错，作用的范围不一样 ，for(j;j<100;j++)
            // 可以省略第一个条件，改写为  for (; j <= 100; j++)
            System.out.print(j);
        }
    }

}
