import java.util.Scanner;

public class WhileQ3 {

	public static void main(String[] args) {
		// ForQ5P118을 while 을 사용하는 로직으로 고쳐보세요.
		// i, j변수, 조건식, 증감식 부분을 신경써서 옮겨주세요.
		
		// > ForQ5P118 내용
		
		// Scanner로 정수를 입력받게 해주세요.
		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		// 중첩 반복문을 작성해주세요
		// ***
		// ***
		// *** 과 같이 출력
		// 가로줄 출력 시 System.out.print("*");을
		// 다음 줄로 내일 때만 System.out.println("*");을 사용합니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정사각형 한 변의 길이를 입력해주세요");
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
