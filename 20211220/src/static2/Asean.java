package static2;

public class Asean {
	// 출석(check), 중간고사 (midTerm), 기말고사(finalTerm) 을 변수로 설정
	// 위 변수들은 개별 객체가 따로따로 관리하는 변수들입니다. 
	
	private int check;
	private int midTerm;
	private int finalTerm;
	
	// 공용 발표점수인 presentationScore를 static으로 만들어주세요.
	// 이 점수는 19점 입니다.
	private static int presentationScore = 19;
	
	
	// public으로 설정하면 바로 System.out.println() 으로 조회 가능하고
	// private인 경우는 오로지 static 메서드를 통해서만 조회할 수 있습니다.
	
	// 생성자는 객체 생성시 출석, 중간고사, 기말고사 점수만 받아서 초기화합니다.
	
	public Asean(int check, int midTerm, int finalTerm) {
		this.check = check;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
	}
	
	// static 메서드로 발표점수만 조회할 수 있는 showPre() 를 만들어주세요.
	
	public static void showPre() {
		System.out.println("발표점수 : " + presentationScore);
	}
	
	// 일반 메서드로 showAseanInfo() 를 생성해주시되, 성적 전체를 콘솔에 조회하게 해주세요
	// 중간고사 : XX점, 기말고사 : YY점....
	
	public void showAseanInfo() {
		System.out.println("출석 : " + check + ", 중간고사 : " + midTerm + ", 기말고사 : " + finalTerm + ", 발표점수 : " + presentationScore);
	}
	
	// private static은 같은 static영역에서 접근하도록 만들어야 합니다. 
	public static void showPre2() {
		System.out.println("Asean조의 발표점수는 : " + presentationScore);
	}
	

	// 위 요소 정의 후 Main01.java를 생성해서 구성원 4명을 만들어서 활용해보세요
}