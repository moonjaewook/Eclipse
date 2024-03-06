
import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		int a = Method.inputNum1();
		int b = Method.inputNum2();
		String op = Method.operator();
		
		Method.select(a, b, op);
		
	}

	
	public static int inputNum1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1을 입력해주세요.");
		int num1  = sc.nextInt();
		return num1;
	}
	
	public static String operator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("연산자를 입력해주세요.");
		String operator = sc.next();
		return operator;
	}
	
	public static int inputNum2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2을 입력해주세요.");
		int num2  = sc.nextInt();
		return num2;
	}
	
	public static void select(int num1,int num2,String operator) {
		switch(operator) {
		case "+" :
			System.out.println(Method.plus(num1,num2));
			break;
		case "-" :
			System.out.println(Method.minus(num1,num2));
			break;
		case "*" :
			System.out.println(Method.multiply(num1,num2));
			break;
		case "/" :
			System.out.println(Method.divide(num1,num2));
			break;
		default :
			System.out.println("연산자 오류입니다.");
		}
	}
	
	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double divide(int num1, int num2) {
		return (double)num1 / num2;
	}
	
}
