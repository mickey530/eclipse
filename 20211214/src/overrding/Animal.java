package overrding;

public class Animal {

	public String name;
	public boolean carnivores;
	public String habitat;
	
	public void howl() {
		System.out.println("동물이 웁니다.");
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name + ", 육식동물 : " + carnivores + ", 서식지 : " + habitat);
	}
}
  