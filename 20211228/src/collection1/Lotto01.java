package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto01 {

	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보겠습니다.
		// 로또복권 추첨기는 1~45 범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 콘솔에 찍어주도록 만들어주세요.
		// ArrayList의 정렬은 .sort() 대신
		// Collections.sort(ArrayList)를 사용합니다.
		
		Random random = new Random();
		List<Integer> arr1 = new ArrayList<>();
		
		int count = 0;
		while(count < 6) { //.size() 를 사용하는 것이 보다 직관적
			int lottoNum = random.nextInt(45)+1; // while 블럭 밖에 lottoNum을 초기화 했다면 2등 번호때 재사용 가능
			if(arr1.contains(lottoNum)){
				continue;
			} else {
				arr1.add(lottoNum);
				count++;
			}
			Collections.sort(arr1);
		}
		System.out.println("1등 당첨 번호 : " + arr1); 
		
		// 2등 번호 추첨
		int lottoNum2 = random.nextInt(45)+1;
		int i = 0;
		while(i < 1) {
			if(arr1.contains(lottoNum2)) {
				continue;
			} else {
				i++;
				System.out.println("2등 당첨 번호 : " + lottoNum2);				
			}
		}
	}
}
