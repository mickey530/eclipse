package interaction;

public class Buyer {

	private int money;
	private int mango;
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
	}
	
	public void buyMango(Seller seller, int mangoCount) {
//		System.out.println("망고 " + mangoCount + "개, " + 1000 * mangoCount + "원 입니다. 구매하시겠습니까?");
//	
//		if(seller.getMango() >= mangoCount) {
//			if(this.money >= 1000 * mangoCount) {
//				seller.sellMango(mangoCount);
//				this.money -= 1000 * mangoCount;
//				this.mango += mangoCount;
//				System.out.println("망고 " + mangoCount + "개를 구입했습니다. 현재 잔액 : " + this.money + "원 입니다.");
//				
//			} else {
//				System.out.println("잔액이 부족합니다.");
//		}
//		}else {
//			System.out.println("망고 재고가 부족합니다.");
//		}
		
		// 강사님 버전 (이게 더 가독성이 좋고 깔끔한듯)
		
		if(mangoCount * 1000 > this.money) {
			System.out.println("잔액이 부족합니다. 현재 소지금 : " + this.money);
			return;
		}
		
		if(mangoCount > seller.getMango()) {
			System.out.println("망고 재고가 부족합니다. 망고 재고 : " + seller.getMango());
			return;
		}
		this.mango += mangoCount;
		this.money -= mangoCount * 1000;
		
		seller.sellMango(mangoCount);
		
	}
	 
	public void showBuyer() {
		System.out.println("----- 인벤토리 -----"); 
		System.out.println("망고 : " + this.mango);
		System.out.println("소지금 : " + this.money);
		System.out.println("------------------");
	}
} 
