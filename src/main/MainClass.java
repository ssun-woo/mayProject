package main;

import java.util.Scanner;

<<<<<<< HEAD
import member.MemberServiceImpl;
import shopping.ShoppingService;
import shopping.ShoppingServiceimpl;
import board.BoardServicelmpl;
=======
import event.EventService;
import event.EventServiceImpl;
>>>>>>> hyeonuk

public class MainClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
<<<<<<< HEAD
		ShoppingService ss = new ShoppingServiceimpl();

        MemberServiceImpl mb = new MemberServiceImpl();


		BoardServicelmpl bd = new BoardServicelmpl();


		while (true) {
=======
		EventServiceImpl ev = new EventServiceImpl();
		
		
		
		while(true) {
>>>>>>> hyeonuk
			System.out.println("1. 회원 기능");
			System.out.println("2. 이벤트 기능");
			System.out.println("3. 구매 기능");
			System.out.println("4. 게시글 기능");

			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("회원 기능");
				mb.addMember("홍길동", "hgd@naver.com", "1234");
		
				break;
			case 2:
				System.out.println("이벤트 기능");
				ev.eView();
				break;
			case 3:
				System.out.println("구매 기능");
				ss.buy();
				break;
			case 4:
				System.out.println("게시글 기능");
				bd.bWrite();
				bd.bWrite();
				break;
			default:
				System.out.println("잘못된 입력입니다");
				break;

			}

		}

	}

}
