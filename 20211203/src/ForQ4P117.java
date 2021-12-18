
public class ForQ4P117 {

	public static void main(String[] args) {
		// 2~9단까지 모두를 출력하는 코드를 작성해주세요
		// 구구단은 2 ~ 9 단까지 출력하면 됩니다.
		// 바깥쪽 반복문은 (int i)2 ~ 9 까지 반복
		// 안 쪽 반복문은 (int j)1~9 까지 반복
		// i * j 
		
		for(int i = 2 ; i < 20 ; i++) {
			System.out.println("--- " + i + " 단 ---");
			for(int j = 1 ; j < 20 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
//		int i = 2;
//		while(i < 10) {
//			int j = 1; // j 가 while 문 밖에 있는 경우 i 구문이 반복 될 때 초기화가 되지 않는다.
//			while(j <10) {
//				System.out.println(i + " * " + j + " = " + i*j);
//				j++;
//			}
//			System.out.println("----------");
//			i++;
//		}
	}
}
