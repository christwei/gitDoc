package com.mingrisoft.lang;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

import org.apache.commons.lang.SerializationUtils;

import java.io.Serializable;

class Student implements Serializable {
    
    private static final long serialVersionUID = -8396517822004869094L;
    private int id;
    private String name;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "学生id：" + id + "，学生姓名：" + name;
    }
}


public class SerializationUtilsTest {
    public static void main(String[] args) {
        Student student = new Student();// 创建student对象
        student.setId(10);// 初始化id属性
        student.setName("明日科技");// 初始化name属性
        System.out.println("将student对象序列化成byte数组");
        byte[] studentByte = SerializationUtils.serialize(student);// 将对象转换成byte数组
        System.out.println("输出序列化数组：");
        System.out.println(Arrays.toString(studentByte));// 输出byte数组
        System.out.println("将student对象序列化到本地文件");
        FileOutputStream out = null;// 创建文件输出流对象
        try {
            out = new FileOutputStream(new File("d:\\student.txt").getAbsoluteFile());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        SerializationUtils.serialize(student, out);// 将对象写入到student.txt文件
        System.out.println("文件生成成功！");
        System.out.println("从本地文件反序列化student对象");
        FileInputStream in = null;// 创建文件输入流对象
        try {
            in = new FileInputStream(new File("d:\\student.txt").getAbsoluteFile());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Student newStudent = (Student) SerializationUtils.deserialize(in);// 读入对象
        System.out.println("查看student对象的属性");
        System.out.println(newStudent);
    }
}
