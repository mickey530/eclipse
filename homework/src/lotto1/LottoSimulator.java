package lotto1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoSimulator {
	// 로또복권 추첨기를 만들어보겠습니다.
	// 로또복권 추첨기는 1~45범위에서 겹치는 숫자 없이
	// 6개의 숫자를 뽑습니다.
	// 순서를 정렬해서 콘솔에 찍어주도록 만들어주세요.
	// ArrayList의 정렬은 .sort() 대신
	// Collections.sort(ArrayList)를 사용합니다.
	public static void main(String[] args) {
		// Integer를 저장받는 빈 ArrayList 만들기
		List<Integer> lotto = new ArrayList<>();
		
		// 내가 고른 로또 번호 [1, 2, 3, 4, 5, 6]
		List<Integer> myNum = new ArrayList<>();
		myNum.add(1);myNum.add(2);myNum.add(3);
		myNum.add(4);myNum.add(5);myNum.add(6);
		
		int count = 0;
		
		while(!myNum.equals(lotto)) {
			
			// 로또번호를 받을 수 있는 변수 생성 후 0으로 초기화
			int getNum = 0;
			
			
			// while문 조건은 번호를 담은 ArrayList의 내부 요소 개수가 6이 되면 종료되도록
			while(lotto.size() != 6) {
				// 번호 뽑기
				getNum = (int)(Math.random() * 45) + 1;
				// 번호가 만약 기존에 뽑은 번호 목록에 포함되어있지 않다면
				if(!lotto.contains(getNum)) {
					// 추가하기
					lotto.add(getNum);
				}
			}
			
			// 다 돌면 정렬하기
			Collections.sort(lotto);
			
			// 추첨번호 보여주기
			System.out.println("추첨된 번호 : " + lotto);
			count++;
			
			// 당첨이 안됐다면 리스트를 비우고 다시 25번 라인으로
			if(!myNum.equals(lotto)) {
				lotto.clear();
			}
			
		}
		System.out.println("당첨되었습니다! 누적 로또 구매 비용 : " + count*1000);
	}
}
