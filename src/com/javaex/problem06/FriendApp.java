package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		Friend[] friendArray = new Friend[3];
		String[] strArray;
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.println("친구를 3명 등록해 주세요");
		
        for (int i = 0; i < friendArray.length; i++) {
			str = sc.nextLine();
			strArray = str.split(" ");
			
			friendArray[i]= new Friend();
			friendArray[i].setName(strArray[0]);
			friendArray[i].setHp(strArray[1]);
			friendArray[i].setSchool(strArray[2]);
			// Friend 객체 생성하여 데이터 넣기

		}
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        }

        sc.close();
    }

}