package com.Pracice02.ex;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		int max ;
		int min ;
		
		if(num1>num2) {
			max = num1;
			min = num2;
			System.out.println("큰수:"+max+"		작은수:"+min);
		}
		else{
			max = num2;
			min = num1;
			System.out.println("큰수:"+max+"		작은수:"+min+"입니다");
		}
		
		sc.close();
		
}
}