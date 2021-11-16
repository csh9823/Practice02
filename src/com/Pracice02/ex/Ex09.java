package com.Pracice02.ex;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int num1, num2, max, min;
		
		System.out.print("첫번째 숫자: ");
		num1=sc.nextInt();
		System.out.print("두번째 숫자: ");
		num2=sc.nextInt();
		
		if(num1>num2 && num1%num2==0) {	 
			 max=num1;
			 min=num2;
			 System.out.println(min+"는(은)"+max+" 의 약수입니다.");
		}
		else if(num1<num2 && num2%num1==0) {
			max=num2;
			min=num1;
			System.out.println(min+"는(은)"+max+" 의 약수입니다.");
		}
		else if(num1>num2 && num1%num2!=0){
			max=num1;
			min=num2;
			System.out.println(min+"는(은)"+max+" 의 약수가 아닙니다.");
		}
		else {
			max=num2;
			min=num1;
			System.out.println(min+"는(은)"+max+" 의 약수가 아닙니다.");
		}
		sc.close();
 }

}
