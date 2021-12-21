package interface1;
public class Airplane implements Vehicle{
	
	private String name;
	private int speed;
	private int gas;
	
	public Airplane(String name) {
		this.name = name;
		this.speed = MIN_SPD;
		this.gas = AIRPLANE_MAX_GAS;
	}
	
	@Override
	public void accel() {
		if(this.speed + AIRPLANE_INCREASE_SPD > AIRPLANE_MAX_SPD) {
			this.speed = AIRPLANE_MAX_SPD;
		} else {
			this.speed += AIRPLANE_INCREASE_SPD;
		}
		this.gas -= AIRPLANE_USE_GAS;
	}

	@Override
	public void breakSpeed() {
		if(this.speed - AIRPLANE_DECREASE_SPD < MIN_SPD) {
			this.speed = AIRPLANE_DECREASE_SPD;
		} else {
			this.speed -= AIRPLANE_DECREASE_SPD;
		}	
	}

	@Override
	public void reFuel() {
		if(this.gas + AIRPLANE_REFUEL_GAS > AIRPLANE_MAX_GAS) {
			this.gas = AIRPLANE_MAX_GAS;
		} else {
			this.gas += AIRPLANE_MAX_GAS;
		}
	}

	@Override
	public void showStatus() {
		System.out.println("비행기 조종사 : " + this.name);
		System.out.println("현재 속도 : " + this.speed);
		System.out.println("남은 연료 : " + this.gas);
		System.out.println("============");
	}

}
