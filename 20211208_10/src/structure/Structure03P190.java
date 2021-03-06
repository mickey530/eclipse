package structure;

public class Structure03P190 {
	
	public static void catInfo(Cat a) {
		System.out.println(a.name + "에 대한 정보입니다.");
		System.out.println("이름 : " + a.name);
		System.out.println("나이 : " + a.age);
		System.out.println("컬러 : " + a.color);
		System.out.println("울음소리 : " + a.sound);
	}

	public static void main(String[] args) {
		// 1번 고양이 생성
		
		Cat c1 = new Cat();
		c1.name = "김애용";
		c1.age = 3; 
		c1.color = "치즈냥이";
		c1.sound = "애~용";
		
		// 2번 고양이 생성
		Cat c2 = new Cat();
		c2.name = "때껄룩";
		c2.age = 4;
		c2.color = "블랙";
		c2.sound = "때껄룩.";
		
		 
		catInfo(c1);
		catInfo(c2);
		
		
		
	}
}
