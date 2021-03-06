package structure;

import java.util.Scanner; // command 누르고 open Dclaration

	// 현실세계에서 일어나는 일을 컴퓨터상에서 묘사하기 위해
public class Structure01P190 {


	public static void main(String[] args) {
		// 이제부터는 실행코드와 정의코드를 분리합니다.
		// main이 있는 클래스는 실행만 하고
		// 실제 로직은 다른 .java파일에 저장합니다.
		
		// 커스텀 디자인 자료형은
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		Person p1 = new Person();
		// p1 내부에 정의한 변수를
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		p1.name = "최한결";
		System.out.println(p1.name);
		p1.age = 20;
		System.out.println(p1.age);
		p1.pNum = "01021392477";
		System.out.println(p1.pNum);
		p1.uNum = 1;
		System.out.println(p1.uNum);
		
		// 또 다른 사람을 하나 만들어봅니다.
		Person p2 = new Person();
		// p2에도 name, age, pNum, uNum을 부여해서
		// 콘솔에 찍어주세요.
		p2.name = "최한결2";
		System.out.println(p2.name);
		p2.age = 22;
		System.out.println(p2.age);
		p2.pNum = "010213924772";
		System.out.println(p2.pNum);
		p2.uNum = 2;
		System.out.println(p2.uNum);
		
		System.out.println(p1.name + "의 정보입니다.");
		System.out.println("이름 : " + p1.name + ", 나이 : " +p1.age + ", 번호 : " + p1.pNum +", 회원번호 : " + p1.uNum);
	}
} 
