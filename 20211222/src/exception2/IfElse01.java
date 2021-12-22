package exception2;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		// int a, b 에 스캐너로 각각 정수를 입력받아주세요
 		// a / b의 결과를 콘솔에 띄워주시되
		// a / b를 실행하기 전에
		// b 가 0인지 검사해서 0인 경우는
		// a / b를 하지 말고 0으로 나눌 수 없습니다.
		// 라는 경고만 띄우도록 만들어주세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("a 나누기 b 계산기");
		System.out.println("정수 a를 입력해주세요");
		int a = scan.nextInt();
		System.out.println("정수 b를 입력해주세요");
		int b = scan.nextInt();
		if(b == 0) {
			System.out.println("0으로 숫자를 나눌 수 없습니다.");
			System.out.println("할 수 있는 사람은 논문쓰러 가세요.");
		} else {
			System.out.println(a + "나누기 " + b + "는 " + a/b + "입니다.");
		}
		// 예외처리를 위한 코드인지, 단순 if else문인지 구분이 안됨.
	}
}
