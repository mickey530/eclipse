import java.util.Arrays;

public class EnhancedFor01P162 {

	public static void main(String[] args) {
		// 향상된  for문은 반복문 진행시 타겟으로 배열을 넣습니다.
		// 이 경우 반복실행 횟수는 배열의 내부요소 갯수만큼입니다.
		
		// 7개의 요소를 묶어서 arr1에 저
		int[] arr1 = {100, 211, 399, 475, 591, 600, 700};
		
		// arr1[순번] 을 입력해서 내부 요소를 하나만 꺼낼 수 있음(순번은 0부터 시작)
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[3]);
		
		// for(하나씩 받을 변수 : 배열){
		//		실행문들..;
		// }
		
		for(int item: arr1) {
			System.out.println(item);
		}
		// 배열 내부 요소의 개수는 배열명.length로 확인할 수 있다.
		for(int i = 0 ; i < arr1.length ; i++) {
			System.out.println(arr1[i]);
			
		}
	}
}
