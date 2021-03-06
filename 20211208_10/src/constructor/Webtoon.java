package constructor;

public class Webtoon {

	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
	public Webtoon(String n, String p) {
		name = n;
		series = 1;
		painter = p;
		complete = false;
	}
	
	public void getInfo() {
		System.out.println("제목 : " + name + ", 회차 : " + series + ", 작가 : " + painter + ", 완결여부 : " + complete);
	}
	
	public void uploadWebtoon() {
		series += 1;
	}
	
	public void completedWebtoon() {
		complete = true;
	}
	
}
