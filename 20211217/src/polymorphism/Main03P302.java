package polymorphism;

public class Main03P302 {

	public static void main(String[] args) {
		
		// 개발자 생성 및 정보조회, Person으로 개발자를 받음
		
		Person c1 = new Coder("김코더", 25, "java");
		
		Person p1 = new PetCakeCooker("강아지케잌", 20, "연어/불고기");
		
		c1.showPerson();
		p1.showPerson();
	}
	
}
