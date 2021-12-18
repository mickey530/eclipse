import java.util.Scanner;

public class ElseIf01P97 {

	public static void main(String[] args) {
		// else if는 추가적인 조건을 달 때 사용
		// if문 다음에 작성하며, else문 이전에 작성
		// else if 는 else와는 달리 조건식을 기입해야함
		// else if문은 몇 개라도 작성 가능
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요.");
		int num = scan.nextInt();
		
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if(num == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}
	}
}
