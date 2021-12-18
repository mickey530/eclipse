
public class For02P117 {

	public static void main(String[] args) {
		// 중첩 반복문은 반복문을 반복하는 구문입니다.
		// 다중 for 문이라고도 부르는 이 구문은
		// for문 내부에 추가로 for문을 작성해 구성하며
		// 실행 횟수는 바깥쪽 반복문의 반복횟수*안쪽 반복문 반복횟수 입니다.
		// 굉장히 많은 분야에서 응용되고 있으므로 반드시 잘 익혀두셔야 합니다.
		
		// Hello Java를 3번 반복하는 구문을 작성해보세요.
		
		for (int j = 0 ; j < 5 ; j++) {
			for (int i = 0 ; i < 5 ; i++) {
				System.out.println("데드리프트" + (i+1) + "회");
			
			}
			System.out.println((j+1) + "세트");
		}
		// like 헬스 i회 j세트
	}
} 