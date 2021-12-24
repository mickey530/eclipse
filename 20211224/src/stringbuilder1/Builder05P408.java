package stringbuilder1;

public class Builder05P408 {

	public static void main(String[] args) {
		// 다음 문자열의 문자를 0번부터 시작해서 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 쓰세요.
		
		// 문자열은 "abcdefghijklmnopqrstuvwxyz" 입니다. 
		
		StringBuilder alpha = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		
//		for(int i = 2; i < alpha.length(); i += 2) {
//			alpha.deleteCharAt(i);
//		}
//		System.out.println(alpha);
		
		// 돌아가는 로직이 이해가 안된다면 sysout으로 찍어보자!
		for(int i = 0; i < alpha.length(); i++) {
			System.out.println("i % 1의 결과 :" + i % 1);
			System.out.println("현재 i의 값 " + i);
			System.out.println(alpha);
			System.out.println("================");
			if(i % 1 == 0) { // if(true) 랑 동일!
				alpha.deleteCharAt(i);
			}
		}
		System.out.println(alpha);
	}
}
 