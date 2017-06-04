package com.mingrisoft.beanutils;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import java.util.HashMap;
import java.util.Map;

class Employee {
    
    private String name;
    private String[] phoneNumber = new String[10];
    private Map<String, String> address = new HashMap<String, String>();
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String[] getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public Map<String, String> getAddress() {
        return address;
    }
    
    public void setAddress(Map<String, String> address) {
        this.address = address;
    }
}

public class BeanCopyTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();// 声明Employee变量
        Employee employee2 = new Employee();// 声明Employee变量
        try {
            // 为employee1赋值
            PropertyUtils.setSimpleProperty(employee1, "name", "明日科技");
            PropertyUtils.setIndexedProperty(employee1, "phoneNumber", 0, "1234567");
            PropertyUtils.setMappedProperty(employee1, "address", "home", "中国");
            BeanUtils.copyProperties(employee2, employee1);// 将employee1复制到employee2
            // 获得employee2的属性值
            String name = (String) PropertyUtils.getSimpleProperty(employee2, "name");
            String phoneNumber = (String) PropertyUtils.getIndexedProperty(employee2, "phoneNumber", 0);
            String address = (String) PropertyUtils.getMappedProperty(employee2, "address", "home");
            // 输出employee2的属性值
            System.out.println("复制属性值之后：");
            System.out.println("name属性：" + name);
            System.out.println("phoneNumber属性的第一个值：" + phoneNumber);
            System.out.println("address属性home键所对应的值：" + address);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
