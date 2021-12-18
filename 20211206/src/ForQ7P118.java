import java.util.Scanner;

public class ForQ7P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요
		// ****
		// ***
		// **
		// *
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 힌트 : 별 개수가 점점 줄어드는데, i-- 와 j-- 와 같이
		// 변수 크기를 줄여가면서 진행하셔야 합니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("역 피라미드 숫자를 입력해주세요.");
		int count = scan.nextInt();
		
		for(int i = count ; i > 0 ; i--) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
//		System.out.println("역 피라미드 숫자를 입력해주세요");
//		int count = scan.nextInt();
//		int i = 0;
//		
//		while(i < count) {
//			int j = 0;
//			while(j < count - i) {
//				System.out.print("*");
//				j++;
//			} System.out.println();
//			i++;
//		}
	}
}






