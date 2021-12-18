package game.interaction;

public class Blue {

	private int hp;
	private int atk;
	private int def;
	
	public Blue() {
		this.hp = 10;
		this.atk = 5;
		this.def = 3;
	}
	
	public void doBattle(int uAtk) {
		if(this.hp <= 0) {
			this.hp = 0;
			System.out.println("블루가 죽었습니다.");
		} else {
			this.hp = this.hp + this.def - uAtk;
		} System.out.println("블루 남은 체력 : " + this.hp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
}


