package main;

import java.util.Scanner;

import board.BoardServicelmpl;
import event.EventServiceImpl;
import member.MemberServiceImpl;
import shopping.ShoppingService;
import shopping.ShoppingServiceimpl;

public class MainClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ShoppingService ss = new ShoppingServiceimpl();
        MemberServiceImpl mb = new MemberServiceImpl();
		BoardServicelmpl bd = new BoardServicelmpl();
		EventServiceImpl ev = new EventServiceImpl();
		
		
		
		while(true) {
			System.out.println("1. 회원 기능");
			System.out.println("2. 이벤트 기능");
			System.out.println("3. 구매 기능");
			System.out.println("4. 게시글 기능");

			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("회원 기능");
				mb.addMember("홍길동", "hgd@naver.com", "1234");
				mb.showMemberCount();
		
				break;
			case 2:
				System.out.println("이벤트 기능");
				ev.eView();
				ev.allEvent();
				break;
			case 3:
				System.out.println("구매 기능");
				
				System.out.println("1.구매하기 2.구매목록보기");
				int choice2 = scan.nextInt();
				
				if(choice2 == 1) {
					ss.buy();
				}else if(choice2 == 2) {
					ss.buyList();
				}
				
				
				break;
			case 4:
				System.out.println("게시글 기능");
				bd.bWrite();
				bd.bVeiw();
				bd.bEdit();
				break;
			default:
				System.out.println("잘못된 입력입니다");
				break;

			}

		}

	}

}
