package polymorphism;

public class Coder extends Person{
	
	private String lan;

	public Coder(String name, int age, String lan) {
		super(name, age);
		this.lan = lan;
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("언어 : " + this.lan);

	}
} 
 