import java.util.Scanner;

public class ContinueQ1_2P123 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("목표 정수를 입력해주세요");
		int goal = scan.nextInt();
		
		int total = 0;
		int count = 0;
		
		for(int a = 1; a <= goal; a++) {
			if(a % 2 == 0) {
				continue;
				
			}
			total += a;	
		}
		System.out.println("총합 : " + total);
	}
}
