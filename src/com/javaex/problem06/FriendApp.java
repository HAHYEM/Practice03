package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		Friend[] friendArray = new Friend[3];
		String[] strArray;
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.println("ģ���� 3�� ����� �ּ���");
		
        for (int i = 0; i < friendArray.length; i++) {
			str = sc.nextLine();
			strArray = str.split(" ");
			
			friendArray[i]= new Friend();
			friendArray[i].setName(strArray[0]);
			friendArray[i].setHp(strArray[1]);
			friendArray[i].setSchool(strArray[2]);
			// Friend ��ü �����Ͽ� ������ �ֱ�

		}
        for (int i = 0; i < friendArray.length; i++) {
            //ģ������ ��� �޼ҵ� ȣ��
        }

        sc.close();
    }

}