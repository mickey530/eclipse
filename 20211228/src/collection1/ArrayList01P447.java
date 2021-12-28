package collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01P447 {

	public static void main(String[] args) {
		// List는 생성자료형으로 ArrayList, LinkedList를 받을 수 있고
		// 기본적으로는 ArrayList를 쓰게 됩니다. 
		// java.util의 List나 ArrayList를 사용할 수 있습니다.
		
		// List는 생성시 List<자료형> 을 적어넣어 해당 자료형을
		// 가변 길이 배열형태로 받아줄 수 있습니다. // <>를 이용해서 작성하는 것을 제네릭이라고 함.
		// <> 사이에는 기본형 자료(int, double, boolean 등 보라색으로 처리되는.)는 올 수 없음.
		
		// 정수 자료를 받을 수 있는 리스트 생성(길이는 가변적)
		List<Integer> list1 = new ArrayList<>(); // 이 부분 넘 어렵... 위에 import 주의.
		
		// 가변자료형이므로 추가하고싶은 만큼 자료 추가 가능
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		list1.add(1, 100);
		System.out.println(list1);
		list1.set(1,  99);
		System.out.println(list1);

		
		
		
	}
}
