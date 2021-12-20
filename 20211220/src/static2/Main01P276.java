package static2;

public class Main01P276 {

	public static void main(String[] args) {
		
		Asean a1 = new Asean(10, 10, 3);
		Asean a2 = new Asean(15, 5, 10);
		Asean a3 = new Asean(20, 20, 20);
		Asean a4 = new Asean(30, 30, 20);
		
		Asean.showPre();
		
		a1.showAseanInfo();
		a2.showAseanInfo();
		a3.showAseanInfo();
		a4.showAseanInfo();
	}
	
}
