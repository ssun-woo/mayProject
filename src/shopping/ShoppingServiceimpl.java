package shopping;

public class ShoppingServiceimpl implements ShoppingService{
	@Override
	public void buy() {
		System.out.println("물품을 구매합니다");
	}

	@Override
	public void buyList() {
		System.out.println("구매목록 입니다");
	}
}
