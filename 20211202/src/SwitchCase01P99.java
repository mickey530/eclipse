
public class SwitchCase01P99 {

	public static void main(String[] args) {
		// switch ~ case 구문은 변수에 들어있는 자료가 case문에 제시된
		// 자료와 일치하는지 여부로 논리식을 실행합니다. 
		// switch(변수) {
		// case 값1:
		//		실행문;
		// case 값2...
		// }
		// 와 같이 작성
		// 마지막에 default 문을 작성시 if~else문의 else처럼 기능합니다.
		// if, else문과 비교하여 범위로 지정할 수 없
		
		int a = 3;
		switch(a) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default :
			System.out.println("1~5가 아니네요. 하핳.");
			break; // 코드 일관성, 가독성을 위해 필요없지만 default에도 break를 작성하기도 함.
		}
	}
}
