package map1;

import java.util.HashMap;
import java.util.Map;

public class MapMap01P458 {

	public static void main(String[] args) {
		// Map 인터페이스의 대표 구현체는 HashMap입니다.
		// 제네릭 내부에는 <key자료형, Value자료형>으로 작성합니다.
		Map<String, String> map = new HashMap<>();
		map.put("최한결", "자바");
		map.put("코로나", "백신");
		map.put("김계란", "헬창");
		map.put("쵸단", "헬창");
		System.out.println(map);
		
		// 자료조회시는 .get(key값)으로 조회가능합니다.
		// map은 key로 Value를 조회하는 것은 가능하지만 역은 불가능합니다.
		// 없는 키값으로 조회하면 null이 나온다.
		// 인덱스 번호도 없습니다.
		System.out.println(map.get("김계란"));
//		System.out.println(map.get("헬창"	);
		
		// remove는 key를 이용해서 key = value 전체를 삭제합니다.
		map.remove("코로나");
		System.out.println(map);
		
		// .size()는 크기를 알려줍니다. 정수로 몇 개의 key = value 쌍이
		// 저장되어있는지 확인할 수 있습니다.
		System.out.println(map.size());
		
	}
}
