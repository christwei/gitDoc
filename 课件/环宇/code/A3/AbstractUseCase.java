package com.lzw;

abstract class Plane { // 定义接口
	public abstract void fly(); // 定义方法
	public void repair() {
		System.out.println("飞机在修理");
	}
}
public abstract class AbstractUseCase {
	
	public static void main(String args[]){
		new Plane();
	}
}

