package thiskeyword;

public class Main01P224 {

	public static void main(String[] args) {
		// Person을 두 명 생성해 주시되
		// 생성시 지역간 데이터 교환을 염두에 두고 확인해가면서 생성해보세요.
		// 생성된 Person은 getInfo()를 실행합니다.
		
		Person p1 = new Person("김럭스", 17, 5000, "빛 마법");
		p1.getInfo();
		
		Person p2 = new Person("김바이", 18, 3000, "복싱");
		p2.getInfo();
	}
}
 