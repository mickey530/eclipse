package constructor;

public class BasketballPlayer {
	public int height; // 키(신장)
	public int jumpHeight; // 점프력
	
	// 변수는 첫 단어 첫 글자는 소문자, 이후 단어 첫 글자는 대문자 (camel case)
	
	// 생성자는 class명과 똑같이 적는다.
	
	public BasketballPlayer(int h, int j) {
		height = h;
		jumpHeight = j;
		System.out.println("키 : " + h + ", 점프력 : " + j);
	}

	public void dunkShoot() {
		if(height + jumpHeight > 300) {
			System.out.println("덩크슛에 성공했습니다.");
		} else {
			System.out.println("골대에 닿지 않았습니다.");
		}
	}
}
 