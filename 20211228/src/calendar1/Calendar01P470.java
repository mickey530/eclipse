package calendar1;

import java.util.Calendar;

public class Calendar01P470 {

	public static void main(String[] args) {
		// Calender는 현재 시간을 일반 시간이 아닌 요일, 오전/오후 등으로
		// 달력기준으로 표기해주는 방식입니다.
		// Calander.getInstance(); 를 이용해 사용합니다.
		// 추상클래스이므로 new 키워드를 쓸 수 없습니다.
		Calendar now = Calendar.getInstance();
		
		System.out.println("년도 : " + now.get(Calendar.YEAR));
		
		// 월은 0부터 시작합니다.(0이 1월, 11이 12월)
		System.out.println("월 : " + now.get(Calendar.MONTH));
		System.out.println("일 : " + now.get(Calendar.DAY_OF_MONTH));
		
		// 요일도 얻을 수 있는데, 요일은 1이 일요일, 7이 토요일입니다. (0이 없음)
		System.out.println("요일 : " + now.get(Calendar.DAY_OF_WEEK));
		
		// 오전 0, 오후 1
		System.out.println("오전, 오후 여부 : " + now.get(Calendar.AM_PM));
		System.out.println("시 : " + now.get(Calendar.HOUR));
		System.out.println("분 : " + now.get(Calendar.MINUTE));
		System.out.println("초 : " + now.get(Calendar.SECOND));
		
	}
}
