package game.inheritance;

// 1. 뼈대가 되는 정보를 가진 Commoner 상속
public class Warrior extends Commoner{
	
	private int pDam;

	public Warrior(String id) {
	super(id); // 다른 코드에 앞서서 무조건 1순위로 들어와야함
	this.pDam = 2;
		
	
	}
	public void getInfo() {
		System.out.println("---- 스텟창 ----");
		System.out.println("아이디 : " + id);
		System.out.println("LV : " + lv);
		System.out.println("HP : " + hp);
		System.out.println("MP : " + mp);
		System.out.println("pDam : " + pDam);
	}
}
