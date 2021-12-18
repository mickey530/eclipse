package accessmodifier;

public class Warrior {

	// hp, mp, lv, atk, def, exp, name;
	// 변수값은 현실에서도 특정한 물체나 사람의 상태를 임의로 바꿀 수 없으므로
	// 외부에서 값을 함부로 고칠 수 없도록 Private으로 처리합니다. 
	
	private String name;
	private int hp;
	private int mp;
	private int lv;
	private int atk;
	private int def;
	private int exp;
	
	// 생성자를 만들어주시되, name만 사용자에게 입력받고, 나머지는
	// 체력20, 마나10, 레벨1, 공격력3, 방어력0, 경험치0 이 대입되도록 처리해주세요.
	
	
	public Warrior(String n){
		name = n;
		hp = 20;
		mp = 10;
		lv = 1;
		atk = 3;
		def = 0;
		exp = 0;
		System.out.println("전사 생성 완료");
		System.out.println("아이디 : " + name + ", 레벨 : " + lv);
	}
	
	// hunt 메서드를 만들어보겠습니다.
	// 이 메서드는 실행시 사냥을 하는데 체력이 2깎이고 경험치가 10 올라갑니다.
	// 사냥 결과 체력이 x이 되었고, 누적 경험치는 y입니다. 라고 출력
	// 생성자를 비롯한 메서드는 행동을 나타내고
	// 이런 행동의 성공/실패 여부는 오로지 정보(변수)에 의해 결정되며
	// 시도 자체에 대해서는 제한을 두지 않습니다.
	
	public void hunt() {
		hp -= 2;
		exp += 10;
		System.out.println("현재 체력 : " + hp + ", 누적 경험치는 " + exp);
	}
}
