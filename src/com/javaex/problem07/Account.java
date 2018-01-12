package com.javaex.problem07;

public class Account {

	private String accountNo;
	private int balance;

	public Account(String accountNo) {
		this.accountNo = accountNo;
	} // ������ �ۼ�

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) {
		if (balance > money) {
			balance -= money;
		} else {
			System.out.println("�ܰ����");
		}
	}

	public void showBalance() {
		System.out.println("���� �ܰ�� > " + balance);
	}
	// �ʿ��� �޼ҵ� �ۼ�

}