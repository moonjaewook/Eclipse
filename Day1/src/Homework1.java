//과제1
import java.util.Scanner;

public class Homework1 {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a를 입력해주세요.");
		int a = sc.nextInt();
		
		System.out.println("b를 입력해주세요.");
		int b = sc.nextInt();
		
		if (a > b){
			System.out.println("a가 b보다 큽니다.");
		} else if (a == b) {
			System.out.println("a와 b가 같습니다.");
		} else {
			System.out.println("b가 a보다 큽니다.");
		}
	}
}