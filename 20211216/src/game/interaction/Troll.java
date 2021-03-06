package game.interaction;

public class Troll {

	private int hp;
	private int atk;
	private int def;
	
	public Troll() {
		this.hp = 8;
		this.atk = 4;
		this.def = 1;
		System.out.println("트롤이 생성되었습니다.");
	}
		
	public void doBattle(int uAtk) {
		hp = hp + def - uAtk;
		if(hp <= 0) {
			hp = 0; 
			System.out.println("트롤이었던 것입니다.");
			return; // else도 가능하지만 의미 차원에서 return이 좀 더 맞는듯
		}
		System.out.println("트롤의 남은 체력 : " + hp);
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
