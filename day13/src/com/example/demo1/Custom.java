package com.example.demo1;

public class Custom {
    private  String name;
    private  int  age;


    public Custom() {
    }

    public Custom(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //idea 默认生成的equals() 方法
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Custom custom = (Custom) o;
//
//        if (age != custom.age) return false;
//        return name != null ? name.equals(custom.name) : custom.name == null;
//    }

    //手动重写equals方法
    @Override
    public boolean equals(Object object){
        if (object == this){
            return true;
        }
        if (object instanceof Custom){
            Custom custom = (Custom) object;// age 是基本数据类型 ，name 是引用数据类型
            if (this.age == custom.age && this.name.equals(custom.name)){ // 因此age比较用 == ，name  用equals

                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }

    //idea 自动生成的toString()方法
//    @Override
//    public String toString() {
//        return "Custom{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    //手动生成toString()
    @Override
    public String toString(){
        return "Customer [name=" + name + ", age=" + age + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
