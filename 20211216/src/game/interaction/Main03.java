package game.interaction;

public class Main03 {

	public static void main(String[] args) {
		Magician m1 = new Magician("럭스");
		
		Archer a1 = new Archer("애쉬");
		
		Warrior w1 = new Warrior("가렌");
		
		Orc o1 = new Orc();
		
		m1.huntOrc(o1);
		m1.huntOrc(o1);
		
		
		Troll t1 = new Troll();
		
		m1.huntTroll(t1); // 마법사가 한대
		a1.huntTroll(t1); // 궁수가 한대

		Blue b1 = new Blue();
		
		w1.huntBlue(b1);
		m1.huntBlue(b1);
		a1.huntBlue(b1);
		w1.huntBlue(b1);
		w1.huntBlue(b1);
		w1.huntBlue(b1);
		w1.huntBlue(b1);
		w1.huntBlue(b1);
 
	}
}
