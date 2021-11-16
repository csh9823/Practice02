package com.Pracice02.ex;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력해 주세여");
		System.out.print("숫자: ");
		int num= sc.nextInt();
		
		if(num>0) {
			int num1= 7*num+2;
			double num2=num1;
			System.out.println("계산결과는 "+num2+" 입니다.");
		}
		else {
			int num1 = num*num*num-9*num;
			int num3 = num1+2;
			double num2 = num3;
			System.out.println("계산결과는 "+num2+" 입니다.");	
		}
		sc.close();
}
}
