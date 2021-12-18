package polymorphism;

public class Soldier extends Person{
	
	private String c;

	public Soldier(String name, int age, String c) {
		super(name, age);
		this.c = c;
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("계급 : " + this.c);		
	}

}
 