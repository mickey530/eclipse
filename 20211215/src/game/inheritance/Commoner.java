package game.inheritance;

public class Commoner {

	// 아이디, 레벨, 체력, 마나수치
	protected String id;
	protected int lv;
	protected int hp;
	protected int mp;

	// 생성자는 레벨 1, 체력 20, 마나 10을 기본으로, 아이디는 입력받아 처리
	public Commoner(String id) {
		// 생성자 내부에서 멤버변수를 초기화할때는 this. 붙이는 경우가 많다. (id는 필수로 붙여야함!)
		this.id = id;
		this.lv = 1;
		this.hp = 20;
		this.mp = 10;
	}
	public void getInfo() {
		System.out.println("---- 스텟창 ----");
		System.out.println("아이디 : " + id);
		System.out.println("LV : " + lv);
		System.out.println("HP : " + hp);
		System.out.println("MP : " + mp);
	}
}
