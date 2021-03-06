package game.interaction;

public class Archer {

	private String id;
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
	public Archer(String id) {
		this.id = id;
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.def = 1;
		this.exp = 0;
		System.out.println("궁수가 생성되었습니다.");
	}
	
	public void huntOrc(Orc orc) {
		orc.doBattle(this.atk);
		if(orc.getHp() > 0) {
			this.hp = this.hp + this.def - orc.getAtk();
		} else {
			System.out.println("오크가 이미 죽어서 교전이 끝났습니다.");
		} System.out.println("교전 결과 궁수의 체력 : " + this.hp);
	}

	public void huntTroll(Troll troll) {
		troll.doBattle(this.atk);
		if(troll.getHp() > 0) {
			this.hp = this.hp + this.def - troll.getAtk();
		} else {
			System.out.println("트롤이 이미 죽어서 교전이 끝났습니다.");
		} System.out.println("교전 결과 궁수의 체력 : " + this.hp);
	} 
	
	public void huntBlue(Blue blue) {
		if(blue.getHp() > 0) {
			blue.doBattle(this.atk);
			this.hp = this.hp + this.def - blue.getAtk();
		} else {
			System.out.println("이미 죽은 블루입니다.");
		} 
		System.out.println("교전 결과 전사의 체력 : " + this.hp);
	}
}

