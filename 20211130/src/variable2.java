
public class variable2 {
	public static void main(String[] args) {
		// 변수의 선언
		int b, c; // 동시에 2개 이상 선언 가능.
		b = 10;
		c = 15;
		
		// 선언과 동시에 값을 넣어줄 수도 있다.
		int a = 5; // a라는 박스를 생성하면서 거기에 정수 5를 넣겠다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// a에 있던 값을 20으로 갱신
		a = 20;
		System.out.println(a);
		
		// 정수형에는 4가지 유형이 있음
		// 정수형 변수는 byte, short, int, long 키워드(예약어)를 사용하여 선언합니다. (1byte, 2byte, 4byte, 8byte *효율성)
		// 자바에서 정수의 2진수 표현 방법은 "부호와 2의 보수" 표현방법을 사용
		// 정수형은 10진수뿐만 아니라 2진수, 8진수, 16진수 등의 형태도 표현할 수 있습니다. 
		// 정수형의 디폴트는 int이므로 long형을 지정하려면 할당할 숫자 뒤에 "L"을 붙여줍니다. 
		
		
	}
}
