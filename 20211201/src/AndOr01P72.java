
public class AndOr01P72 {

	public static void main(String[] args) {
		// 논리 연산자는 둘 이상의 논리식을 나열해서 제시 할 때 사용
		// 논리식 1 & 논리식 2 의 경우 양쪽 모두 true인 경우
		// 논리식 1 | 논리식 2 의 경우 한 쪽 이상의 논리식이 다 true인 경우
		// 최종 조건식을 true로 판단
		System.out.println((100>50) & (30 > 50));
		System.out.println(100> 50 | 30 > 50);
	}
}
