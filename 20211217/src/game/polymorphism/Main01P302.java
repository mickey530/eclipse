package game.polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		// Commoner 생성
		Commoner c1 = new Commoner("김전사");
		// Orc
		Monster o1 = new Orc();
		
		c1.hunt(o1);
		c1.hunt(o1);

		Monster s1 = new Slime();
		Monster g1 = new Goblin();
		Monster m1 = new Minion();
		
		c1.hunt(m1);
		c1.hunt(g1);
		c1.hunt(s1);
		
		
	}
}
