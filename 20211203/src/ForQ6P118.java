import java.util.Scanner;

public class ForQ6P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// *
		// **
		// ***
		// ****
		// 중첩 반복문의 어느 곳이 세로, 가로를 담당하는지 생각해보세요.
		// 힌트 : 별 갯수가 점점 늘어나는데, 점점 숫자가 커지는 변수가 뭐가 있을지 생각해보세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("피라미드 숫자를 입력해주세요");
		int count = scan.nextInt();
		
		for(int i = 1 ; i <= count ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			} System.out.println();
		} scan.close();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("피라미드 숫자를 입력해주세요.");
//		int count = scan.nextInt();
//		int i = 1;
//		while(i <= count) {
//			int j = 0;
//			while(j < i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		} scan.close();
	}
}
