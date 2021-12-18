
public class ForQ9P118 {

	public static void main(String[] args) {
		
		// 중첩 반복문을 이용해서
		// 다음 방정식의 양의 정수
		// 해를 모두 구하시오
		// 4x + 5y = 60
		
		int x, y;
		
//		for(x = 1 ; x < 60/4 ; x++) {
//			for(y = 1 ; y < 60/5 ; y++) {
//				while(4*x + 5*y == 60) {
//					System.out.println("4x + 5y = 60 의 해는 (" + x + ", " + y + ") 이다.");
//					break;
//				}
//			}
//		}
		
		for(x = 1 ; x < 60/4 ; x++) {
			for(y = 1 ; y < 60/5 ; y++) {
				if(x * 4 + y * 5 == 60) {
					System.out.println("4x + 5y = 60 의 해는 (" + x + ", " + y + ") 이다.");
				}
			}
		}
	}
}