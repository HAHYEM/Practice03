package com.javaex.problem04;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        
       System.out.println("�鸸���� " + CConverter.toDoller(1000000) + "�޷��Դϴ�.");

        
       System.out.println("��޷��� " + CConverter.toKWR(100) + "�Դϴ�.");
        
        
    }

}