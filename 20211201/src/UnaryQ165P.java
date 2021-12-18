
public class UnaryQ165P {

	public static void main(String[] args) {
		// int a 에 15를 담은 다음 전위, 후위 -- 를 Unary01 처럼 사용해서
		// 1씩 차감하고, 콘솔에 찍는 것을 반복하라
		// 단 실행 로직은 Unary01에서 그랬든 주석으로 하단에 풀어서 작성
		
		int a = 15;
		System.out.println(a--);
		// 15 출력 > a-1 실행
		System.out.println(a);
		// 14 출력
		System.out.println(--a);
		// a-1 실행 > 13 출력
		System.out.println(a);
		// 13 출력 
	}
}
