package thiskeyword;

public class Person {
	// 사람의 정보를 여기 기입합니다.
	private String name;
	private int age;
	private int money;
	private String major;
	
	// 실행부는 코드의 순서가 중요하지만 정의부의 경우 큰 문제 없다.
	// this를 안붙이게 되면 가장 가까운 파라미터 값의 name을 가져오게 된다.
	// this를 붙이므로써 최상위 지역의 name을 가져온다. 
	
	public Person(String name, int age, int money, String major) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.major = major;
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 소지금액 : " + money + ", 전공 : " + major);
	}
}
 