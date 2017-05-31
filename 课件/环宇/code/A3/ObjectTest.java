package com.object;

public class ObjectTest {
	public static void main(String[] args) {
		Person p = new Person("张三",30,1);
		p.eat();
		p.sleep();
	}
}

class Person {
	String name;
	int age;
	int sex;
	
	public Person() {
		
	}
	
    public Person(String name, int age, int sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
    
    public void eat() {
    	System.out.printf("%s吃饭了",name);
    	System.out.print("\r\n");
    }
    
    public void sleep() {
    	System.out.printf("%s睡觉了",name);
    	System.out.print("\r\n");
    }
}