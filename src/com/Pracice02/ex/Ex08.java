package com.Pracice02.ex;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		System.out.print("숫자3: ");
		num3 = sc.nextInt();
		int min ;
		
		if(num1>num2&& num1>num3) {
			
			if(num2<num3) {
				min = num2;
			}
			
			else {
				min = num3;
			}
			
		}
		 else if(num1<num2&& num2>num3){
			
			if(num1>num3) {
				min =num3;
			}
			else {
				min = num1;
			}
		}
		 else {
			 
			 if(num1>num2) {
				 min=num2;
			 }
			 else {
				 min=num1;
			 }
		 }
		System.out.println("가장 작운수는 "+min+" 입니다.");
		sc.close();
		
}
}