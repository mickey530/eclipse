package overloading;

public class Main {

	public static void main(String[] args) {
		// 1. calculator 생성
		Calculator cal = new Calculator();
		
		// 2. plus(int, int)를 호출해주세요. 값은 임의로 넣어주세요.
		
		cal.plus(1, 3);
		
		// 3. plus(double)을 호출해주세요. 값은 임의로 넣어주세요.
		
		cal.plus(0.75);
		
		// 4. plus(String)을 Calculator에 새로 추가해주시고 호출해주세요.		
		// 이 메서드는 System.out.println("문자열은 연산 대상이 아닙니다."); 라고 출력합니다.
		
		cal.plus("이건 못하지?");
		
	}
}
