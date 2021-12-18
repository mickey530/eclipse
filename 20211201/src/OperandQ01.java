
public class OperandQ01 {

	public static void main(String[] args) {
		// 다음 조건을 만족하는 코드를 작성하시오
		// kor, math, eng, com 변수를 한 줄로 선언
		// 각각 80, 55, 65, 85 를 대입
		// total 변수에 총점 저장
		// 콘솔창에 평균 값 출력
		
		int kor, math, eng, com;
		kor = 80;
		math = 55;
		eng = 65;
		com = 85; 
		int total = kor + math + eng + com;
		System.out.println("평균 : "+ total/4.0);
		// 4로 나누면 정수/정수 라서 결과값도 정수
		// 소수점 아래까지 계산하기 위해서는 4.0으로 나누어야함
	}
}
