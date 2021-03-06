package structure;

public class Structure02P190 {
	
	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	public static void getInfo(Person p) {
		System.out.println(p.name + "에 대한 정보입니다.");
		System.out.println("이름 : " + p.name + ", 나이 : " + p.age + ", 번호 : " + p.pNum + ", 회원번호 : " + p.uNum);
	}
	

	public static void main(String[] args) {
		// 사람을 두명 만들어보세요 (a, b)
		
		Person a = new Person();
		a.name = "나는a";
		a.age = 20;
		a.pNum = "01021392477";
		a.uNum = 0;
				
		Person b = new Person();
		b.name = "나는b";
		b.age = 21;
		b.pNum = "01021392477-2";
		b.uNum = 1;
		
//		System.out.println(a.name + "의 정보입니다.");
//		System.out.println("이름 : " + a.name + ", 나이 : " +a.age + ", 번호 : " + a.pNum +", 회원번호 : " + a.uNum);	
		
		getInfo(a); // a의 주소값을 getInfo의 p에 전달
		getInfo(b); // b의 주소값을 getInfo의 p에 전달
		
	}
}
