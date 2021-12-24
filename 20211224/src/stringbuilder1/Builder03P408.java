package stringbuilder1;

public class Builder03P408 {

	public static void main(String[] args) {
		// Delete() 는 말 그대로 문자열의 일부, 혹은 전체를 삭제합니다.
		// Delete(시작인덱스번호, 끝인덱스번호)를 입력하면
		// 시작지점부터 끝 지점 사이를 삭제해줍니다. (마지막 인덱스를 포함하지 않음 like < )
		StringBuilder a = new StringBuilder("asdfasdfasdf");
		System.out.println(a);
		a.delete(3, 10);
		System.out.println(a);
	}
}
