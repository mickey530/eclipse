package garbagecollection;

public class MainP201 {
	
	public static void main(String[] args) {
		// 6개 객체 생성
		Item i1 = new Item(1);
		Item i2 = new Item(2);
		i2 = null;
		Item i3 = new Item(3);
		// 메모리 중간에 회수하도록 강제 명령 (garbage collection)
		System.gc(); // 힙 전체를 스캔하는 것이 아니기 때문에 삭제되는 시기는 실행시 마다 변동될 수 있다.
		Item i4 = new Item(4); // 랜덤이기 때문에 자바에서는 굳이 사용하지 않는다. 
		i4 = null;
		Item i5 = new Item(5);
		i1 = null;
		System.gc();
		Item i6 = new Item(6);
	}
}
