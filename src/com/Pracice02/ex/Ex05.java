package com.Pracice02.ex;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kg;
		int cm;
		Scanner sc=new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요");
		
		System.out.print("키");
		cm = sc.nextInt();
		System.out.print("몸무게");
		kg = sc.nextInt();
		double g =(cm-100)*0.9;
		if(kg < g){
			System.out.println("저체중 입니다.");			
		}
		else if(kg>g) {
			System.out.println("과체증 입니다.");
		}
		else {
			System.out.print("표준 입니다.");
		}
		System.out.println("표준체중:"+g);
		sc.close();
	}

}
