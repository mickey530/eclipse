package casting;

public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void sit() {
		System.out.println("강아지가 앉습니다.");
	}
	
	public void howl() {
		System.out.println("멍!");

	}
	
}
