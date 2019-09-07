package com.example.exer;

/*
 * 4. 对象数组题目：
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息

提示：
1) 生成随机数：Math.random()，返回值类型double;
2) 四舍五入取整：Math.round(double d)，返回值类型long。
 *
 */

/**
    运行结果如下：

 学号:3,年级:3,分数:34
 学号:4,年级:3,分数:22
 学号:12,年级:3,分数:40
 学号:16,年级:3,分数:85
 ==================
 学号:0,年级:5,分数:16
 学号:15,年级:6,分数:16
 学号:18,年级:4,分数:18
 学号:4,年级:3,分数:22
 学号:17,年级:2,分数:22
 学号:3,年级:3,分数:34
 学号:8,年级:5,分数:36
 学号:19,年级:6,分数:38
 学号:12,年级:3,分数:40
 学号:5,年级:1,分数:44
 学号:9,年级:4,分数:54
 学号:14,年级:1,分数:57
 学号:10,年级:4,分数:59
 学号:6,年级:1,分数:63
 学号:1,年级:5,分数:65
 学号:11,年级:5,分数:81
 学号:16,年级:3,分数:85
 学号:2,年级:6,分数:86
 学号:7,年级:2,分数:86
 学号:13,年级:6,分数:92

 */
public class StudentTest {

    public static void main(String[] args) {
        Student[] students = new Student[20];
        for (int i = 0; i < 20; i++) {
            Student student = new Student();
            student.number = i ;
            student.state = (int)(Math.random() * (7-1) + 1);
            student.score = (int)(Math.random() * (99-10) + 10);
            students[i] = student;
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == 3 ){
                students[i].info();
            }
        }

        System.out.println("==================");

        /**
         * 冒泡排序注意：
         *  一共有两层循环：
         *      外层循环是需要遍历的数组常度 -1 ，为什么要减一呢？因为最后一个不用比较，
         *      内层循环是比较相邻元素的大小的 ，所以要减 i
         *      相邻元素之间(当前一个和后一个进行比较)的比较大小是采用元素相互交换的方式
         */

        //方式一：定义临时变量的方式
        //推荐的方式
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;

        //方式二：好处：不用定义临时变量
        //弊端：① 相加操作可能超出存储范围 ② 有局限性：只能适用于数值类型
        //num1 = num1 + num2;
        //num2 = num1 - num2;
        //num1 = num1 - num2;

        //方式三：使用位运算符
        //有局限性：只能适用于数值类型
        //num1 = num1 ^ num2;
        //num2 = num1 ^ num2;
        //num1 = num1 ^ num2;

        for (int i = 0; i <students.length -1; i++) {
            for (int j = 0; j < students.length - 1 -i ; j++) {
                if (students[j].score > students[j+1].score){
                    Student temp = students[j]; //这里是对象数组
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < students.length; i++) {
            students[i].info();
        }
    }


}
class  Student{

    int number;
    int state;
    int score;
    public  void info (){
        System.out.println("学号:" + number + ",年级:" + state + ",分数:" + score);
    }

}