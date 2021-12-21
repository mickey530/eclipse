package interface1;

// 인터페이스 구현(상속이 아님!) 하기 위해서는 
// extends 대신에 implements를 사용합니다.
// 인터페이스 내부의 추상메서드는 무조건 전부 구현해야 합니다. 
public class Car implements Vehicle{
	// 자동차라면 가져야 하는 변수 설정
	// 현재속도, 현재연료량, 차주
	
	private int Speed;
	private int gas;
	private String owner;
	
	// 생성자를 만들어주세요. 차주만 입력받고
	// 나머지 요소는 현재속도 0, 연료량 100을 자동으로 대입해주세요.
	
	public Car(String owner) {
		this.owner = owner;
		this.Speed = MIN_SPD; 
		this.gas = CAR_MAX_GAS;
	}
	
	@Override
	public void accel() {
		// 한 번 가속시 속도가 10씩 늘어나도록 해주세요.
		// 연료는 한 번 가속에 1씩 소비합니다.
		// 단 속도는 200을 초과할 수 없습니다.
		if(gas <= 0) {
			System.out.println("연료가 부족합니다.");
			return;
		}
		if(this.Speed + CAR_INCREASE_SPEED > CAR_MAX_SPD) {
			this.Speed = CAR_MAX_SPD;
		}
		this.gas -= CAR_USE_GAS;
		this.Speed += CAR_INCREASE_SPEED;
	}

	@Override
	public void breakSpeed() {
		// 한 번 감속할 때마다 속도가 10씩 줄어들도록 해주세요.
		// 단, 속도가 0 미만이 될 수 없습니다.
		if(this.Speed - CAR_DECREASE_SPEED < MIN_SPD) {
			this.Speed = MIN_SPD;
			return;
		}
		this.Speed -= CAR_DECREASE_SPEED;
	}

	@Override
	public void reFuel() {
		// 연료는 다시 채울 때마다 30씩 채워줍니다.
		// 단, 연료 최대값은 상수 MAX_GAS로 처리
		if(this.gas + CAR_REFUEL_GAS > CAR_MAX_GAS) {
			this.gas = CAR_MAX_GAS;
			return;
		}
		this.gas += CAR_REFUEL_GAS;
	}

	@Override
	public void showStatus() {
		// 자동차의 정보를 조회할 수 있오록 작성해주시면 됩니다. 
		System.out.println("현재 차주 : " + this.owner);
		System.out.println("현재 속도 : " + this.Speed);
		System.out.println("남은 연료 : " + this.gas);
		System.out.println("====================");
	}

}
