package game.inheritance;

public class Main03 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("가렌");
		
		Magician m1 = new Magician("럭스");
		
		Archer a1 = new Archer("애쉬");
		
		w1.getInfo();
		m1.getInfo();
		a1.getInfo();
	}
}
