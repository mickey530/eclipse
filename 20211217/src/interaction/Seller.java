package interaction;

public class Seller {

	private int money;
	private int redPotion;
	private int bluePotion;
	
	public Seller(int redPtion, int bluePotion) {
		this.redPotion = redPtion;
		this.bluePotion = bluePotion;
	}
	
	public void sellPotion(int r, int b) {
		System.out.println("빨간포션 " + r + "개 파란포션 " + b + "개 총합 " + (r+b)*1000 + "원 입니다." );
		if(this.redPotion < r || this.bluePotion < b) { // 둘 중 하나라도 부족하다면
			System.out.println("재고가 부족합니다.");
			return;
		}
		this.redPotion -= r;
		this.bluePotion -= b;
		this.money += (r+b)*1000;
		}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getRedPotion() {
		return redPotion;
	}

	public void setRedPotion(int redPotion) {
		this.redPotion = redPotion;
	}

	public int getBluePotion() {
		return bluePotion;
	}

	public void setBluePotion(int bluePotion) {
		this.bluePotion = bluePotion;
	}
	
}
