package string1;

public class String07P399 {

	public static void main(String[] args) {
		// toUpperCase() 는 문자열 전체를 대문자로 바꿉니다.
		String hello = "Hello Java";
		System.out.println(hello.toUpperCase()); // 저장되는건 아님
		
		// toLowerCase() 는 문자열 전체를 소문자로 바꿉니다.
		System.out.println(hello.toLowerCase()); // 역시 저장되는 것은 아님
	}
}
