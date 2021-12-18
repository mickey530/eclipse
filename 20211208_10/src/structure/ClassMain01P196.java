package structure;

public class ClassMain01P196 {
	// PersonClass의 메서드는 작성할 필요가 없습니다.
	// 이미 PersonClass의 내부에 필요한 메서드를 다 작성해놨기 때문입니다.
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어 보세요.
		
		PersonClass p1 = new PersonClass();
		p1.name = "인공인간";
		p1.age = 1001;
		p1.pNum = "101010101";
		p1.uNum = 1023;
		p1.game = "롤";
		

		PersonClass p2 = new PersonClass();
		p2.name = "인공인간2";
		p2.age = 1002;
		p2.pNum = "202020202";
		p2.uNum = 2023;
		p2.game = "오버워치";
		
		// 만든 사람 두 명의 정보를 콘솔에 찍어보세요.
		p1.getInfo();
		p2.getInfo();
		
		
	}
} 
 