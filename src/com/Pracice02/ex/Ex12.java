package com.Pracice02.ex;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc= new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String ti= sc.nextLine();
		System.out.print("숫자1: ");
		int num = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		if (ti.equals("*")) {
			double numx = num*num2;
			System.out.println("결과는: "+numx);
		}
		else  if(ti.equals("+")) {
			double numx = num+num2;
			System.out.println("결과는: "+numx);	
		}
		else  if(ti.equals("-")) {
			double numx = num-num2;
			System.out.println("결과는: "+numx);	
		}
		else if(ti.equals("/")&& num!=0 && num2!=0) {
			double numx = num/num2;
			System.out.println("결과는: "+numx);	
			
		}
		else {
			System.out.println("계산 할 수 없습니다..");
		}
		sc.close();
}
}