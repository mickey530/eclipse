package casting;

public class Main01 {

	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형이든 받을 수 있다.
		// Cat, Dog, Animal을 하나씩 만들어주세요
		// Animal c1, d,1 a1 으로 받아주세요.
		Animal c1 = new Cat("삼색이", 2);
		Animal d1 = new Dog("댕댕이", 3);
		Animal a1 = new Animal("그냥 동물", 4);
		// c1, d1, a1에 .sit()을 각각 호출해보세요.
		c1.sit();
		d1.sit();
		a1.sit();
		
		Cat cat = (Cat)c1; // c1은 Animal타입이지만 힙에 저장된 데이터가 Cat이르모 Cat으로 변환 가능
		
		cat.howl(); // Animal 자료형 c1 과 Cat 자료형 cat. 힙 주소는 같음 
		
		Dog dog = (Dog)d1;
		
		dog.howl();
	}
}
 