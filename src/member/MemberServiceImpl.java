package member;

import java.util.ArrayList;
import java.util.List;

public class MemberServiceImpl implements MemberService {
	    private List<MemberService> members = new ArrayList<>();

	  
	    public void addMember(String name, String email, String password) {
	       System.out.println(name+email+password);
	       
	    }


		
		public void showMemberCount() {
			System.out.println("가입한 회원수가 보여지는 기능입니다.");
		}


		
		
}
