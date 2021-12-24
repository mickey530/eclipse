package string1;

public class String08P399 {

	public static void main(String[] args) {
		// trim() 은 공백이 아닌 문자가 시작하기 직전 모든 지점과
		// 공백이 아닌 문자로 끝난 이후 모든 공백을 제거합니다.
		String str = "               Hello         Java                   ";
//		System.out.println(str.trim());
//		System.out.println(str);
		
		System.out.println(str.trim().replace("  ", ""));
		
		
	}
}
