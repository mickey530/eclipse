package accessmodifier2;

import accessmodifier.Warrior;

public class Main02P197 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("김데마시아");
		// w1.hp = 10000000;
		// hp가 package friendly 일 때
		// package가 달라서 접근 불가.
		w1.hunt();
		w1.hunt();
		w1.hunt();
	}
}
