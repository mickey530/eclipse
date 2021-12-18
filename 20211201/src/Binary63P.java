
public class Binary63P {

	public static void main(String[] args) {
		// 이항 연산자는 양 변에 하나씩 항목을 취하는 연산자입니다.
		// 산술연산자는 우리가 잘 알고 있는 사칙연산 등을 활용하기 위한
		// 연산자이며, 연산 순위도 그대로 계승됩니다.
		// 단, % 연산자의 우선순위는 *, /와 동일합니다.
		// +, =, *
		System.out.println(3 + 5);
		System.out.println(17 - 21);
		System.out.println(2 * 3);
		
		// / 는 왼쪽 수를 오른쪽으로 나눠서 몫을 구합니다. (정수 / 정수 = 정수)
		System.out.println(7 / 2); // 3.5를 정수로 바꿔서 출력
		System.out.println(7 / 2.0); // casting 을 사용하여 실수로 바꾸어 출력
		
		// % 는 정수 최대 몫을 구하고 남은 값만 출력한다. 
		System.out.println(10 / 4);
		
		// 연산자의 우선순위 현실과 동일하게 존재
		System.out.println((10 + 6) % 4);
		
	}
}
