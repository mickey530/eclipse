package structure;

public class PersonClass {
	// class 설정

	// 사람 정보를 Person에서 만들었던 것 처럼 만들어주시되
	// 여러분들이 추가하고 싶은 특성을 하나 더 추가해서 만들어주세요.
		
	public String name; // 이름
	public int age; // 나이
	public String pNum; // 연락처
	public int uNum; // 회원번호
	public String game; // 하는 게임
	
	
	
	// 추가로 아까의 조회 메서드를 내부에 생성해주세요
	// 클래스 내부에 생성할 때는 static을 적지 않습니다.
	// 클래스는 자기와 같은 지역에 있는 요소를 소속 명시 없이 조회 가능합니다.
	// > 바꿔 말하면 다른 지역에 있는 요소를 호출할 때에는 소속을 명시해야 합니다.
	public void getInfo() {
		System.out.println(name + "의 정보를 조회합니다.");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("연락처 : " + pNum);
		System.out.println("회원번호 : " + uNum);
		System.out.println("플레이중인 게임 : " + game);
		
		
		System.out.println("=======================");
	} 
}
