package main;

import java.util.Scanner;

import board.BoardServicelmpl;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BoardServicelmpl bd = new BoardServicelmpl();
		
		while(true) {
			System.out.println("1. 회원 기능");
			System.out.println("2. 이벤트 기능");
			System.out.println("3. 구매 기능");
			System.out.println("4. 게시글 기능");
			
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.println("회원 기능");
				break;
			case 2 :
				System.out.println("이벤트 기능");
				break;
			case 3 :
				System.out.println("구매 기능");
				break;
			case 4 :
				System.out.println("게시글 기능");
				bd.bWrite();
				bd.bVeiw();
				bd.bEdit();
				break;
			default :
				System.out.println("잘못된 입력입니다");
				break;
					
			}
			
			
			
			
			
		}
		
		
		
		
	}

}
