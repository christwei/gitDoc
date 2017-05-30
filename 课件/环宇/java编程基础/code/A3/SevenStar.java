package com.hysoft.test;

import java.util.Random;
import java.util.Scanner;

public class SevenStar {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int times = new Scanner(System.in).nextInt();
        
        for (int i = 0; i < times; i++) {
            
            String luckNumber = "";;
            while (luckNumber.length() < 7) {
                int number = new Random().nextInt(10);// 生成随机数
                luckNumber = luckNumber + number;// 
            }
            System.out.println(luckNumber);
            
        }
    }

}
