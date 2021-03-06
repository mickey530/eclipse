package game.accessmodifier;

public class Magician extends Commoner {
	
	public Magician(String id) {
		super(id);
	}

	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		// hp -= 2; 를 직접 실행할 수 없으므로 private
		// public인 setter의 setHp를 이용한다.
		// setHp(5) 인 경우, 기존의 값 대신 hp변수에 5로 교체해달라는 요청임.
		// but 현재 원하는 것은, 현 hp값에서 사냥할 때마다 체력이 2씩 깎이는 것.
		setHp(getHp() - 2);
		// 경험치도 마찬가지로 setExp()
		setExp(getExp() + 10);
		
	}
	
	public void getInfo() {
		// 심지어 private 요소는 수정이 아닌 조회도 불가능
		System.out.println("현재 체력 : " + getHp());
		System.out.println("현재 마나 : " + getMp());
		System.out.println("누적 경험치 : " + getExp());
	}
	
	// fireball 메서드
	// 마나가 2 줄고, 경험치는 20 증가
	public void fireball() {
		System.out.println("광휘의 특이점 시전");
		setMp(getMp() - 3);
		setExp(getExp() + 20);
	}
	// heal 메서드
	// 마나가 2 줄고 체력이 10 회복됩니다.
	public void heal() {
		System.out.println("소환사 주문 회복 : 체력이 10만큼 회복됩니다.");
		setMp(getMp() - 2);
		setHp(getHp() + 10);
	}
	
} 
