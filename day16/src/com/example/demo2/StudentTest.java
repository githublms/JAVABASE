package com.example.demo2;

/**
 输入的数据不合法
 最后的代码。仍然会执行下面语句
 继续向下执行
 */
public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.regist(-10);
            System.out.println(student);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("最后的代码。仍然会执行下面语句");
        }
        System.out.println("继续向下执行");
    }
}

class Student{

    private int id ;

    public void regist(int id) throws MyException {
        if (id > 0 ){
            this.id = id;
        }else{
            throw new MyException("输入的数据不合法");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}



