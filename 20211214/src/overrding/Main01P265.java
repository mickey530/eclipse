package overrding;

public class Main01P265 {

	public static void main(String[] args) {
		
		// 고양이, 강아지 생성.
		Dog d1 = new Dog();
		d1.name = "랑이";
		d1.carnivores = true;
		d1.habitat = "랑이네 집";
		d1.size = "중형";
		
		d1.getInfo();
		d1.howl();

		Cat c1 = new Cat();
		c1.name = "삼색이";
		c1.carnivores =true;
		c1.habitat = "hahaha";
		c1.color = "삼색";
		
		c1.getInfo();
		c1.howl();
	}
}
