package random1;

import java.util.Random;
import java.util.Scanner;

public class Random02P484 {

	public static void main(String[] args) {
		// Random객체를 생성한 다음 nextBoolean()기능을 이용해서
		// 동전 던지기 카운팅 프로그램을 만들어주세요.
		// n회 던졌을 때 true가 나오면 앞면, false가 나오면 뒷면으로 간주해서
		// 프로그램이 다 끝났을 때 앞면 몇 회, 뒷 면 몇 회 인지
		// 콘솔에 출력해주세요
		// 실행 횟수 n회는 스캐너로 입력받습니다. 
		
		Random random = new Random();
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int front = 0;
		
		System.out.println("동전 던질 횟수를 알려주세요.");
		int count = scan.nextInt(); // 처음에 이 부분을 까먹어서 오류가 발생했음.
		
		while(i < count) {
			boolean result = random.nextBoolean();
			if(result) {
				front += 1;
				i++; // 이 코드가 전부 앞면이 나온 이유
				// i++이 if블럭 내부에 있어서 true인 경우만 i값이 더해짐 > i값과 front값이 같을 수 밖에..
				// i++이 if블럭 외부에, while블럭 내부에 존재해야
			}
		}
		
		System.out.println(count + "번 던진 결과값");
		System.out.println("앞면 : " + front);
		System.out.println("뒷면 : " + (count - front));
		
//		// 동전 던질 횟수 입력받기
//		System.out.println("동전 던질 횟수를 알려주세요.");
//		int count = scan.nextInt();
//		
//		// 앞면 뒷면 카운팅할 변수 생성(0으로 시작)
//		int front = 0;
//		int back = 0;
//		
//		// 랜덤변수 실행 후 반복은 동전 던질 횟수만큼 돌려서
//		for(int i = 0; i < count; i++) {
//			boolean result = random.nextBoolean();
//			if(result) {
//				front++;
//			} else {
//				back++;
//			}
//		}
//		
//		System.out.println(count + "번 던진 결과값");
//		System.out.println("앞면 : " + front);
//		System.out.println("뒷면 : " + back);
		
		
		
		
		
		
		
	}
}
