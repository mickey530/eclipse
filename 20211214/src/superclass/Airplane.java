package superclass;

public class Airplane {
	
	// 비행기는 속도를 가집니다.
	// private일 경우 자식클래스에서 사용이 불가하기 때문에 비워두거나 protected를 사용.
	protected int speed;
	
	// 생성자는 속도를 입력한 값으로 맞춰줍니다.
	public Airplane(int speed) {
		if (0 < speed && speed < 900) {
			this.speed = speed;
			System.out.println("현재 비행기 속도 : " + speed);
		} else {
			System.out.println("잘못된 입력값입니다.");
		}
	}
	
	// fly() 메서드를 정의하는데 속도가 500씩 붙습니다.
	// 단, 일반 비행기는 속도가 900 초과일 수 없습니다.
	public void fly() {
		
		if((speed + 500) > 900) {
			speed = 900;
		} else {
			speed += 500;
		}
		System.out.println("현재 속도 : " + speed);
	}
	// breakSpeed() 메서드를 수행하면 속도가 100씩 감속합니다.
	// 단, 브레이크 구동의 최저 속도는 0입니다.
	public void breakSpeed() {
		if((speed - 100) <= 0) {
			speed = 0;
			System.out.println("비행기 멈췄어요");
		} else {
			speed -= 100;
			System.out.println("현재 속도 : " + speed);
		}
	}
}
