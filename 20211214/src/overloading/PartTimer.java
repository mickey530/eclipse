package overloading;

public class PartTimer {
	// 파트타이머 정보
	// 오픈/미들/마감, 시급, 가게명, 이름
	private boolean open;
	private int pay; // 시급
	private String shopName;// 가게명
	private String name;
	
	// 생성자 오버로딩은, 생성자를 여러개 오버로딩 형식으로 만드는 것입니다.
	// open, pay, shopName, name을 모두 받는 생성자를 만들어주세요.
	// 접근 제한자는 public 입니다.
	
	public PartTimer(boolean o, int p, String s, String n) {
		open = o;
		pay = p;
		shopName = s;
		name = n;
		
		if(pay < 8720) {
			pay = 8720;
		}
		
		System.out.println("알바가 생성되었습니다.");
		System.out.println("오픈 : " + open);
		System.out.println("시급 : " + pay);
		System.out.println("가게명 : " + shopName);
		System.out.println("알바생 : " + name);
	}
	
	// 오버로딩은 이름은 같은데 파라미터값의 종류나 개수가 다르면 중복 작성을 허용합니다.
	// open, shopName, name 만 입력받는 생성자를 하나 더 중복작성 해주세요.
	// pay는 최저시급으로 넣어주세요
	
	public PartTimer(boolean o, String s, String n) {
		open = o;
		pay = 8720;
		shopName = s;
		name = n;
		
		System.out.println("알바가 생성되었습니다.");
		System.out.println("오픈 : " + open);
		System.out.println("시급 : " + pay);
		System.out.println("가게명 : " + shopName);
		System.out.println("알바생 : " + name);
	}

}
