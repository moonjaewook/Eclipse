//과제2
import java.util.Scanner;

public class Homework2c {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자1을 입력해주세요.");
		int a = sc.nextInt();
		
		System.out.println("연산자를 입력해주세요.");
		String str  = sc.next();
		
		System.out.println("숫자2을 입력해주세요.");
		int b = sc.nextInt();
		
		if (str.equals("+")) {
			System.out.println(a+str+b+"="+(a+b));
		} else if (str.equals("-")) {
			System.out.println(a+str+b+"="+(a-b));
		} else if (str.equals("*")) {
			System.out.println(a+str+b+"="+(a*b));
		} else if (str.equals("/")) {
			System.out.println(a+str+b+"="+((double)a / (double)b));
		} else {
			System.out.println("올바른 입력이 아닙니다.");
		}
	}
}