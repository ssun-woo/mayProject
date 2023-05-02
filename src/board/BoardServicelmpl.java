package board;

public class BoardServicelmpl implements BoardService {

	@Override
	public void bWrite() {
		System.out.println("게시물을 작성합니다.");
	}

	@Override
	public void bVeiw() {
		System.out.println("게시물을 확인합니다.");	
	}

}
