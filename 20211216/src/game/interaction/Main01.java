package game.interaction;

public class Main01 {

	public static void main(String[] args) {
		// 전사를 만들어주세요
		Warrior w1 = new Warrior("가렌");
		
		// 오크를 만들어주세요
		Orc o1 = new Orc();
		Orc o2 = new Orc();
		Orc o3 = new Orc();
		
		// 전사의 huntOrc()를 호출해주세요
		
		w1.hunt(o1);
	}
}
 