package exception1;

public class Exception04P348 {

	public static void main(String[] args) {
		// 예외 발생 케이스 4.
		// 특정 배열을 만들었을때 배열 인덱스를 초과해서 입력하는 경우
		int[] arr = new int[5]; // 0, 1, 2, 3, 4 번째 자리까지만 있음
		System.out.println(arr[5]); // 존재하지 않는 번호(5)로 조회해서 예외 발생
	}
}
