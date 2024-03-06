/*
 * instance method
 * : 객체 생성 후 사용할 수 있는 메소드
 * 
 * static method
 * : 객체 유무와 상관없이 사용할 수 있는 메소드
 * 
 */



public class CallByName {
	public static void main(String[] args) {
		
		CallByName.disp2();	//클래스명으로 호출되는애는 무조건 static
		
		CallByName cbn = new CallByName();
		
		cbn.disp1();
		cbn.disp2();
		
		int num = 100;
		
		num = cbn.disp3(num);
		System.out.println(num);
		
		String str = new String("Superman");
		//System.out.println();
		
		cbn.disp4(str);
		
	}
	
	public void disp4 (String s) {
		System.out.println(s);
	}
	
	public int disp3(int num) {
		System.out.println(num);
		num++;
		System.out.println(num);
		
		return num;
	}
	
	public void disp1() {	// call by name
		System.out.println("call by name 1");
	}
	
	public static void disp2() {	// call by name2
		System.out.println("call by name 2");
	}
		
}
