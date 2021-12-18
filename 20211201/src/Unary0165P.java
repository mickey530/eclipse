
public class Unary0165P {

	public static void main(String[] args) {
		// 단항 연산자 ++, -- 
		// ++, -- 는 숫자의 왼쪽 혹은 오른쪽에 붙을 수 있다.
		// 왼쪽에 붙는 경우를 전위수식, 오른쪽에 붙는 경우를 후위수식이라고
		// 표현하며 어느 방향에 붙느냐에 따라 실행 순서가 달라진다.
		// ++는 대상 변수의 숫자를 1증가, --는 1 감소시킨다.
		int a = 1;
		System.out.println(++a); // 전위 수식. 실행 전에 먼저 a 값(1)에서 1증가
		System.out.println(a); // a 값은 1 증가(2)한 채로 유지.
		System.out.println(a++); // 후위 수식, a 출력(2) 후 1 증가.
		System.out.println(a); // a 값은 1 증가한채(3)으로 유지.
	
	}
}
