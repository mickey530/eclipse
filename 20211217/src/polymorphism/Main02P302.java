package polymorphism;

public class Main02P302 {

	public static void main(String[] args) {
		
		Person s1 = new Soldier("김군인", 21, "일병");
		
		Person c1 = new Coder("김코더", 24, "java");
		
		s1.showPerson();
		c1.showPerson();
	}
}
