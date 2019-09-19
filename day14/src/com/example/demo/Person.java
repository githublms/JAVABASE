package com.example.demo;

public class Person {

     String name;
     int age;

     public void eat() {
         System.out.println("人吃饭");
     }

     public void walk(){
         System.out.println("人走路");
     }


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    //默认的equals()
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Person person3 = (Person) o;
//
//        if (age != person3.age) return false;
//        return name != null ? name.equals(person3.name) : person3.name == null;
//    }
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj instanceof Person) {
			Person p = (Person) obj;
			return this.age == p.age && this.name.equals(p.name);
		}

		return false;
	}

}
