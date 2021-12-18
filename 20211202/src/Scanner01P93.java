import java.util.Scanner;

public class Scanner01P93 {

	public static void main(String[] args) {
		// 코드 실행 중 사용자의 입력을 받게 하고 싶은 경우스태너 기능 사용
		// 아래 Scanner 라고 적은 부분에 마우스를 가져다대고 import를 해주세요.
		Scanner scan = new Scanner(System.in);
		
		// 정수 하나를 입력받음
		int a = scan.nextInt();
		
		// 입력받은 정수 출력
		System.out.println(a);
	}
}
