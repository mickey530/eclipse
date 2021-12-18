package overrding;

public class Cat extends Animal{

	public String color;
	
	public void howl() {
		System.out.println("야옹");
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name + ", 육식동물 : " + carnivores + ", 서식지 : " + habitat + ", 컬러 : " + color);
	}
}
  