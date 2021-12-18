import java.util.Scanner;

public class ScannerQ1P93 {

	public static void main(String[] args) {
		// 환율계산기를 만들어보자
		// 네이버에 검색해서 원하는 국가 화폐 환율을 rate 변수에 저장.
		// 스캐너를 이용해서 won 변수에 원화 금액 입력.
		// 원화와 환율을 이용해서
		// 원화 XXXXX원을 환전시 XXXX(화폐) 입니다. 로 결과물 출력
		
		Scanner scan = new Scanner(System.in);
		
		double rate = 1177.00;
		System.out.println("환전할 금액을 입력해주세요 : ");
		int won = scan.nextInt();
		
		// won / rate 를 Math.round()로 감싼다음, 10^n승을 곱라고 10.0n 승으로 나누면
		// n승에 해당하는 자리수 만큼 소수점 자리까지만 나온다.
		System.out.println("원화 " + won + "원을 달러로 환전 시 " + Math.round((won / rate * 10000) / 10000.0) + "$ 입니다.");
		
		// 다 사용한 scan 변수는 .close()로 닫아줘야 메모리가 회수된다.
		scan.close();
		
	}
}


















