package interface1;

// Vehicle을 구현하기 위해 implements를 활용합니다. 
public class Train implements Vehicle{

	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.name = name;
		this.speed = MIN_SPD;
		this.gas = MAX_GAS;
	}

	// 오버라이드 해서 사용해야 하는 구현 메서드
	@Override
	public void accel() {
		// 최대속도 300 / 50씩 증가
		if(this.speed + TRAIN_INCREASE_SPEED > TRAIN_MAX_SPD) {
			this.speed = TRAIN_MAX_SPD;
		} else {
			this.speed += TRAIN_INCREASE_SPEED;
		}
		// 가속 후 연료 차감
		this.gas -= TRAIN_USE_GAS;
	}

	@Override
	public void breakSpeed() {
		if(this.speed - TRAIN_DECREASE_SPEED < MIN_SPD) {
			this.speed = MIN_SPD;
		} else {
			this.speed -= TRAIN_DECREASE_SPEED;
		}
	}

	@Override
	public void reFuel() {
		if(this.gas + TRAIN_REFUEL_GAS > TRAIN_MAX_GAS) {
			this.gas = MAX_GAS;
		} else {
			this.gas += TRAIN_REFUEL_GAS;
		}
	}

	@Override
	public void showStatus() {
		System.out.println("기관사 : " + this.name);
		System.out.println("현재속도 : " + this.speed);
		System.out.println("남은연료 : " + this.gas);
		System.out.println("============");
	}
	
	
}
 