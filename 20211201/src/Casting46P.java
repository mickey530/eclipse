	
public class Casting46P {

	public static void main(String[] args) {
		// 원래는 서로 다른 자료형간에는 연산이 불가능하지만 (비트 갯수의 차이 때)
		// 편의상 컴퓨터가 자동으로 자료형을 보정해주는 경우가 있는데
		// 이를 가리켜 자료형변환이라고 한다. 
		// 자동 형 변환인 Promotion 과 강제 형 변환인 Casting이 있다. 
		// 자동 형 변환은 작은 데이터를 큰 데이터로 바꿀 때 주로 발생하고
		// 강제 형 변환은 큰 데이터를 작은 데이터로 바꿀 때 주로 사용한다.
		
		int a = 5;
		double b = 7.12;
		System.out.println(a+b); // 자동 형 변환, int -> double
		
		// 강제 형 변환 하는 법
		// 변환을 하고 싶은 자료 왼쪽에 (바꿀자료형)자료
		// 형식으로 작성
		System.out.println(a + (int)b);
	}
}
