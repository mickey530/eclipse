package polymorphism;

public class Main01 {

	public static void main(String[] args) {
		// 부모타입인 Person으로 자식인 Student까지 받을 수 있음.
		Person p1 = new Person("초보자", 5);
		Person s1 = new Student("김전사", 10, 3);
		
		// p1과 s1의 showPerson은 다르게 돌아갑니다.
		p1.showPerson(); // Person측 showPerson() 호출
		s1.showPerson(); // Student측 showPerson() 호출 // 가상 메서드 가상 상속 // 오버라이딩 된 메서드만 사용 가능
		
		// 신분 밝히기용 showStudent()를 호출
		// s1은 Person타입이므로 Person에 소속된 자원만 사용 가능
		// s1.showStudent();
	}
	
		
}
 