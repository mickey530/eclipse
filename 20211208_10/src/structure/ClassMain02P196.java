package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model = "테슬라";
		c1.price = 100;
		c1.owner = "일론머스크";
		
		Car c2 = new Car();
		c2.model = "TWG 1837 블랙티";
		c2.price = 1000;
		c2.owner = "미스터 싱가폴";
		
		c1.getInfo();
		c2.getInfo();
	}
}
 