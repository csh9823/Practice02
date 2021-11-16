package com.Pracice02.ex;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num1;
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		num1 = sc.nextInt();
		
		if(num1%3==0&&num1>=0) {
			System.out.println("a팀입니다.");
		}
		else if(num1%3==1&&num1>=0) {
			System.out.println("b팀입니다.");
		}
		else if(num1%3==2&&num1>=0) {
			System.out.println("c팀입니다.");
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
		sc.close();
	}
	

}
