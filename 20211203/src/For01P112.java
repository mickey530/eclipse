
public class For01P112 {

	public static void main(String[] args) {
		// for문은 while문과는 다르게 몇 바퀴를 돌릴지 정해놓고
		// 사용하는 반복문입니다.
		// 문법은
		// for(시작변수; 종료조건; 증감식) {
		// 		실행문1;
		// 		실행문2...
		// }
		// 으로 이루어져 있습니다.
		for(int i = 0; i < 2; i++) { // i = 0 이라면, 종료조건 만큼 반복됨
			System.out.println("for문을 이용한 반복문" + i);
		}
	}
}
