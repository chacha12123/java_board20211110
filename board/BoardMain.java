package board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		// 입력 출력
		System.out.println("출력");
		
		// 입력 -> 입력이 완료(엔터, 줄바꿈)될 때까지 대기
		String str1 = sc.nextLine();		
		// 여러번 입력
		String str2 = sc.nextLine();
		
		System.out.println("입력 완료");
		System.out.println("입력값1 : " + str1);
		System.out.println("입력값2 : " + str2);
		
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.nextLine());
				
		System.out.println(num1 + num2);
		
		
		
	}

}

