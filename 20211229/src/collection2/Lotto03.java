package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		
		// 1. 당첨번호 6개를 뽑습니다.
		List<Integer> myNum = new ArrayList<>();		
		myNum.add(6);
		myNum.add(12);
		myNum.add(18);
		myNum.add(24);
		myNum.add(30);
		myNum.add(36);
				
		// 2. 추첨번호 6개를 뽑습니다.
		List<Integer> lotto = new ArrayList<>();
		int count = 0; // 몇 번 반복했는가?
		
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
		while(!myNum.equals(lotto)) { // 일치하지 않는 동안 반복 > 일치하면 False, while블럭 탈출
			
			int getNum = 0; // 추첨번호 초기화
			
			while(lotto.size() != 6) { // 사이즈가 6이 될 때까지 반복
				getNum = (int)(Math.random()*45) + 1; // 숫자 뽑기
				if(!lotto.contains(getNum)) { // 뽑은 번호가 포함되어있지 않다면
					lotto.add(getNum); // 리스트에 추가
				}
			}
	
			Collections.sort(lotto); // 정렬
			System.out.println("당첨 번호는 " + lotto); // 출력
			
			// 4. 3에서 일치하지 않으면 반복횟수를 1 더하고 다시 추첨번호를 6개를 뽑고
			// 이어서 비교해서 일치여부 검사
			
			// while블럭 첫 줄에 clear를 넣는다면 굳이 if문을 사용하지 않아도 됨
			if(!myNum.equals(lotto)) { // 같지 않다면
				lotto.clear(); // 리스트 비우기 
			}
			count++; // 반복횟수 추가
		}
		System.out.println("당첨되셨습니다! 누적 사용 금액 : " + count*1000 );
	}
}