package interaction;

public class Main01 {

	public static void main(String[] args) {
		
		Seller s1 = new Seller(30);
		
		Seller s2 = new Seller(5);
		
		Buyer b1 = new Buyer(100000);
		
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();
		
		System.out.println("========s2에게구매 ========");
		// 구매자가 상인2를 좋아합니다. 그래서 상인2한테 사러갑니다.
		b1.buyMango(s2, 5);
		
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();
		
		System.out.println("========s1에게구매========");
		// 상인2 재고가 없음!
		b1.buyMango(s1, 10);
		b1.buyMango(s1, 15);
		
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();
	}
	
	
}
   