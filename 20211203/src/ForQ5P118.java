import java.util.Scanner;

public class ForQ5P118 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받게 해주세요.
		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		// 중첩 반복문을 작성해주세요
		// ***
		// ***
		// *** 과 같이 출력
		// 가로줄 출력 시 System.out.print("*");을
		// 다음 줄로 내일 때만 System.out.println("*");을 사용합니다.
		
//		 Scanner scan = new Scanner(System.in);
//		 System.out.println("한 변의 길이를 입력해주세요.");
//		 int num = scan.nextInt();
//		 
//		 for(int i = 0 ; i < num ; i++) {
//			 for(int j = 0 ; j < num ; j++) {
//				 System.out.print("*");
//			 }System.out.println();
//		 }scan.close();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 길이를 입력해주세요.");
		int num = scan.nextInt();
		
		int i = 0;
		
		while(i < num) {
			
			int j = 0;
			while(j < num) {
				System.out.print("*");
				j++;
			} System.out.println();
			  i++;
		} scan.close();
	}
}