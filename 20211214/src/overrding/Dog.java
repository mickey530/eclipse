package overrding;

public class Dog extends Animal{

	public String size;
	
	// 오버라이딩 요건
	// 이름과 같은 리턴자료형 등이
	// 같은 부모쪽 메서드를
	// 중복해서 작성함
	public void howl() {
		System.out.println("멍!");
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name + ", 육식동물 : " + carnivores + ", 서식지 : " + habitat + ", 사이즈 : " + size);
	}
}
