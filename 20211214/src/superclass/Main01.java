package superclass;

public class Main01 {

	public static void main(String[] args) {
		// 비행기를 생성해서 초기 속도는 300 으로 세팅.
		// 가속 2번으로 속도를 900으로 만들어준 다음
		// 0 까지 내려주세요.
		
		Airplane a1 = new Airplane(300);
		
		a1.fly();
		a1.fly();
		
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
	}
}
