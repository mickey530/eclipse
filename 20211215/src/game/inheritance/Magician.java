package game.inheritance;

public class Magician extends Commoner{

	private int mDam;
	
	public Magician(String id) {
		super(id);
		this.mDam = 2;
	}
	public void getInfo() {
		System.out.println("---- 스텟창 ----");
		System.out.println("아이디 : " + id);
		System.out.println("LV : " + lv);
		System.out.println("HP : " + hp);
		System.out.println("MP : " + mp);
		System.out.println("pDam : " + mDam);
	}
}
 