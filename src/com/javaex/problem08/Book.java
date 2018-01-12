package com.javaex.problem08;

import java.util.Scanner;

public class Book {
	
		private int no;
		private String bookName;
		private String author;
		int code;
		
		public Book(int no, String bookName, String author) {
			super();
			this.no = no;
			this.bookName = bookName;
			this.author = author;
			this.code = 1;
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		
		public void print() {
			String ck = "";
			if(code == 1) {
				ck = "재고있음";
			}else if(code == 0) {
				ck = "재고없음";
			}
			String info = "책번호 : " + no + ", 책이름 : " + bookName + ", 책저자 : " + author + ", 대여 가능유무 : " + ck;
			
			System.out.println(info);
		}
		
		public void rent() {
			if(code==1) {
				this.code=0;
				System.out.println(bookName + " 이(가) 대여 됐습니다. "); 
			}else {
				System.out.println(bookName + " 이(가) 이미 대여중입니다. ");
			}
		}
		
	}