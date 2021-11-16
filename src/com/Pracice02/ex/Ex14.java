package com.Pracice02.ex;

import java.util.Scanner;

public class Ex14 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc= new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		int num= sc.nextInt();
		
		if(num>=0&&num<=1000){
			double num1 =0.09*num;
			System.out.println("계산결과는 "+num1+" 입니다.");
		}
		else if(num>1000&&num<=4000) {
			int a=1000;
			double num2 = a*0.09;
			double num3 = 0.18*(num-a);
			double num1= num2+num3;
			
			System.out.println("계산결과는 "+num1+" 입니다.");	
		}
		else if(num>4000&&num<8000) {
			int a = 1000;
			int b = 3000;
			int c = 4000;
			double num1 = a*0.09+b*0.18+0.27*(num-c);
			System.out.println("계산결과는 "+num1+" 입니다.");
		}
		else if(num>=8000) {
			int a = 1000;
			int b = 3000;
			int c = 4000;
			int d = 8000;
			double num1 = a*0.09+b*0.18+c*0.27+0.36*(num-d);
			System.out.println("계산결과는 "+num1+" 입니다.");
			
		}
		else {
			System.out.println("잘못 입력했습니다.");
		}
		sc.close();
}
}