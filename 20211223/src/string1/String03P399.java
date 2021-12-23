package string1;

import java.util.Scanner;

public class String03P399 {

	public static void main(String[] args) {
		// scanner를 통해서 전체 문장을 입력받으세요.
		// 다음으로 문장 내에서 찾고싶은 단어를 추가로 입력받으세요.
		// 문장 내에 있는 단어들의 인덱스 번호와, 몇 개가 검출되었는지
		// 출력해주는 코드를 작성해주세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전체 문장을 입력해주세요.");
		String sentence = scan.nextLine();
		
		System.out.println("문장 내에서 카운팅 할 단어를 입력해주세요.");
		String searchVoca = scan.nextLine();
		
		int count = 0; 
		int i = 0;
		
		boolean bool = true;
		
		while(bool) { // 문장 길이 만큼 반복
			int get = sentence.indexOf(searchVoca, i); // 전체 문장에서 찾으려는 단어, 번째의 인덱스번호
			if (get == -1) { // 더 이상 없다면 반복문 종료
				bool = false; 
			} else {
				i = get + 1; // 찾은 인덱스 번호 다음부터 찾기 위해 다시 대입
				count++;
				System.out.println(get + "번에서 " + count + "번째 " + searchVoca + "이(가) 검출되었습니다.");
			}
		}
	}
}
