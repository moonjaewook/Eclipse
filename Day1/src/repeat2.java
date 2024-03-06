// 과제4
public class repeat2 {
	public static void main(String []args) {
		
		int rect = 1;
		int count = 0;
		
		for(count = 0; rect<500; count++) {
			// rect = rect * 2;
			// rect *= 2;
			rect <<= 1;
		}
		System.out.println(count);
		System.out.println(rect);
	}
}