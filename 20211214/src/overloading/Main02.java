package overloading;

public class Main02 {

	public static void main(String[] args) {
		// 알바생 둘을 만들어주세요.
		// 하나는 시급 15000원으로 해 주시고
		// 다른 하나는 입력없이 생성해주세요.
		
		PartTimer p1 = new PartTimer(false, "맥도날드", "김맥날");
		
		PartTimer p2 = new PartTimer(true, 5000, "버거킹", "김버거킹");
	}
}
