package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> menu = new HashMap<>();
		
		menu.put("순대국", 7000);
		menu.put("피자", 31000);
		menu.put("아메리카노", 4100);
		menu.put("철면수심 차돌짬뽕", 8800);
		menu.put("뼈치킨", 18000);
		
		System.out.println("철면수심 차돌짬뽕 가격 : " + menu.get("철면수심 차돌짬뽕"));
		System.out.println("피자 가격 : " + menu.get("피자"));
		System.out.println("아메리카노 가격 : " + menu.get("아메리카노"));
	}
}
