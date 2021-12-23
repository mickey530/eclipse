package exception3;

public class Exception03P355 {

	public static void main(String[] args) {
		// 다중 catch는 블럭 내부에서 여러 유형의 예외가 발생할 수 있을 때
		// 각각 예외유형을 다르게 처리할 때 사용합니다.
		// 이 때 catch 구문을 여러번 사용할 수 있습니다.
		int[] number = {1, 2, 3, 4, 5, 0};
		
		// 예외가 발생할지도 모르는 코드부터 try 블럭에 넣습니다. 
		try {
			for(int i = 0; i < 6; i++) {
				System.out.println(number[i]); // ArrayIndexOutOfBoundsException
			}
			System.out.println(number[4] / number[5]); // ArithmeticException
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("범위를 벗어난 인덱스 번호를 입력했습니다.");
		}
		catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		catch(Exception e) {
			// Exception e 는 만능처리구문으로 어떤 예외도 다 일괄적으로 처리해줍니다. (다형성 때문)
			// 모든 예외를 일괄적으로 처리하므로 범위가 클 수록 하단에 위치해야 한다. 지키지 않을 시 오류 발
			System.out.println("예외가 발생했습니다.");
		}
		// ArithmeticException도 특별 처리를 해 주세요.
		// 0으로 나눌 수 없습니다. 라고 메세지가 뜨게 해주세요
	}
}
