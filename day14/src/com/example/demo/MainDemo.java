package com.example.demo;

/**
 *  与控制台进行交互的方式二 -->>>：https://www.bilibili.com/video/av47426548/?p=327
 *  首先使用 Run -as  运行MainDemo这个程序
 *  然后在 run - run configuration --》》左侧 找到 MainDemo ，右侧选择 argments
 *  然后在 program argments 的输入框中输入 任意的内容，每个内容以 空格 隔开 ,内容可以带 "" 也可以不带 ""
 *  输入的数据本省就是字符串类型的
 *  然后 run 运行，得到如下的结果

 ********78
 成绩是:78
 ********56
 成绩是:56
 ********12
 成绩是:12
 -------------上面是在eclipse中输入参数-------------
 -------------下面是在命令行中进行参数的交互---------------------
 首先，将这个MainDemo 文件放在桌面 ：文件的位置是:C:\Users\LMS\Desktop\MainDemo.java
 打开文件，将首行删掉
 win + R 输入cmd 进入命令行， 进行如下的操作
 cd C:\Users\LMS\Desktop\
 javac MainDemo.java --->>>编译java文件
 java MainDemo --->> 运行java文件，这时候什么也没有输出
 java MainDemo "56" 79 85 --->> enter回车后，就可以看到结果了
 C:\Users\LMS\Desktop>java MainDemo "78" 59 12

 ********78
 成绩是:78
 ********59
 成绩是:59
 ********12
 成绩是:12
 */
public class MainDemo {
    public static void main(String[] args) {
        for (int i = 0; i <args.length ; i++) {
            System.out.println("********" + args[i]);
            int score = Integer.parseInt(args[i]);
            System.out.println("成绩是:" + score);
        }
    }
}