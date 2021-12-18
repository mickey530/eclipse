import java.util.Scanner;

public class ForQ8P118 {
	
	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		//    *
		//   **
		//  ***
		// ****
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 힌트 : 띄어쓰기를 3/2/1 개 순으로 적는 반복문 하나와
		// 		*을 1/2/3/4 개 순으로 적는 반복문 하나 해서
		// 		i 반복문 내부에 j, k 총 2개의 반복문이 추가로 돕니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 길이를 입력해주세요");
		int count = scan.nextInt();
		
		for(int i = 0 ; i < count ; i++) {
			for(int j = 1 ; j < count - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < i + 1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	} 
}


 








