package arrays1;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Arrays.copyOfRange()는 copyOf()와 유사하지만
		// 시작이 0번 인덱스로 고정되는 copyOf()와 달리
		// copyOfRange(시작번호, 끝번호+1);
		// 와 같이 시작지점과 끝 지점 둘 다 정해줄 수 있습니다.
		
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] arrCopy = Arrays.copyOfRange(arr, 3, 7); // 3~6(3, 4, 5, 6), 7포함 x
		System.out.println(Arrays.toString(arrCopy));
		
		// 끝인덱스 범위를 벗어나게 복사해보세요.
		
		int[] arrCopy2 = Arrays.copyOfRange(arr, 7, 13);
		System.out.println(Arrays.toString(arrCopy2));
	}
}
