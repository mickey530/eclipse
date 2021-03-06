package interaction;

public class Seller {

	private int money; // 매출액
	private int mango; // 망고 재고
	private int price;
	
	public Seller(int mango) {
		this.mango = mango;
		this.money = 0;
		this.price = 1000;
	}
	
	public void sellMango(int mango) {
		if(this.mango >= mango) {
			this.mango -= mango;
			this.money += mango * price;			
		} else if(this.mango < mango) {
			System.out.println("망고가 부족합니다. 현재 망고 " + this.mango + "개 남았습니다.");
		} else {
			System.out.println("오늘 장사 끝났습니다.");
		}
	}
	
	public void showSeller() {
		System.out.println("------ info ------");
		System.out.println("현재 망고 " + this.mango + "개 남았습니다.");
		System.out.println("총 수입 : " + this.money);
		System.out.println("------------------");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMango() {
		return mango;
	}

	public void setMango(int mango) {
		this.mango = mango;
	}
	
}
