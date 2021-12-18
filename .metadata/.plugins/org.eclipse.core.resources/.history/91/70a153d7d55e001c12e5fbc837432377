package interaction;

public class Buyer {

	private int money;
	private int redPotion;
	private int bluePotion;
	
	public Buyer(int money) {
		this.money = money;
	}
	
	public void buyPotion(Seller seller, int r, int b) {
		if((r+b)*1000 > this.money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		if(r > seller.getRedPotion() || b > seller.getBluePotion()) {
			System.out.println("재고가 부족합니다.");
			return;
		}
		this.redPotion += r;
		this.bluePotion += b;
		this.money -= (r+b)*1000;
		seller.sellPotion(r, b);
	}
}
