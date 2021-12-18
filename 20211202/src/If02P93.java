import java.util.Scanner;

public class If02P93 {

	public static void main(String[] args) {
		// 교재 93 페이지 프로그램 4-1 코드
		Scanner scan = new Scanner(System.in);
		// 변수 선
		int su;
		System.out.println("정수입력 : ");
		su = scan.nextInt();
				
		// 만약에 if문의 실행문이 한 줄이라면, {} 생략가능
		if (su > 0) {
			System.out.println("양수입니다.");
		}
		scan.close();
	}
}
