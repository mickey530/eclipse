
public class DataDouble43P {
	public static void main(String[] args) {
		// 실수 표현할 때는 float, double 자료형을 사용.
		// 기본적으로 대입할 목적으로 숫자를 실수로 적으면 double로 간주
		// 만약 float형으로 실수 숫자를 적고 싶다면,
		// 숫자 가장 오른쪽에 f라고 추가로 기입
		float a = 1.1f;//
		double b = 1.1;
		
		System.out.println(a);
		System.out.println(b);
		
		// 제대로 표현되지 않는 실수
		// 이진수로 표현되지 않는 실수값이 결과값인 경우는 정확한 값이 나오지 않는 경우도 있다. 
		double c = 1-(0.1*7);
		System.out.println(c); // 0.299999999993 으로 출력
	}
}
