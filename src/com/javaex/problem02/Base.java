package com.javaex.problem02;

public class Base {
    
    public void service(String state) {
        if(state.equals("��")) {
        	day();
        }else if(state.equals("��")) {
        	night();
        }else if(state.equals("����")) {
        	afternoon();
        }
      
    }

    public void day() {
        System.out.println("������ ������ ������");
    }

    public void night() {
    	System.out.println("night");
    }
    
    public void afternoon(){
        System.out.println("���ĵ� ���� ���������� ���ؾ� �մϴ�.");
    }

}