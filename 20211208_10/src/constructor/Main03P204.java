package constructor;

public class Main03P204 {

	public static void main(String[] args) {
		Webtoon w1 = new Webtoon("이말년씨리즈", "이말년");
		
		w1.getInfo();
		
		w1.uploadWebtoon();
		
		w1.getInfo();

		w1.completedWebtoon();
		
		w1.getInfo();
	}
}