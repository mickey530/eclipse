package game.accessmodifier;

public class Warrior extends Commoner {

	public Warrior(String id) {
		super(id);
	}
	
	public void hunt() {
		System.out.println("전사가 사냥을 시작합니다.");
		setHp(getHp() - 2);
		setExp(getExp() + 10);
	}
	
	
	public void doubleAttack() {
		System.out.println("더블어택 시전");
		setHp(getHp() - 4);
		setExp(getExp() + 25);
	}
		
	public void getInfo() {
		System.out.println("현재 체력 : " + getHp());
		System.out.println("현재 마나 : " + getMp());
		System.out.println("누적 경험치 : " + getExp());
		System.out.println("================");
	}
}
 