package static1;

public class Main02P276 {

	public static void main(String[] args) {
		// static변수는 생성 없이도 활용할 수 있다.
		System.out.println(StaticTest.num2);
		
		// static 메서드도 설정 가능하며 나머지 사항은 변수와 같다.
		StaticTest.check();
		
		StaticTest s1 = new StaticTest();
		
		s1.check();
	}
}
 