package game.interaction;

public class Main04 {

	public static void main(String[] args) {
		// 각 직업군별로 하나씩 생성
		Warrior w1 = new Warrior("가렌");
		Magician m1 = new Magician("럭스");
		Archer a1 = new Archer("애쉬");
		
		Blue b1 = new Blue();
		
		w1.huntBlue(b1);
		m1.huntBlue(b1);
		a1.huntBlue(b1);
	}
}
