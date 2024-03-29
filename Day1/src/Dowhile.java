import java.util.Scanner;

public class Dowhile {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String answer;
		do {
			System.out.println("숫자1을 입력해주세요.");
			int a = sc.nextInt();
			
			System.out.println("연산자를 입력해주세요.");
			String str  = sc.next();
			
			System.out.println("숫자2을 입력해주세요.");
			int b = sc.nextInt();
			
			switch(str) {
			   case "+" :
			      System.out.println(a+str+b+"="+(a+b));
			      break;
			   case "-" :
				   System.out.println(a+str+b+"="+(a-b));
			      break;
			   case "*" :
				   System.out.println(a+str+b+"="+(a*b));
			      break;		      
			   case "/" :
				   System.out.println(a+str+b+"="+((double)a / (double)b));
			      break;		      
			   default:     //그외의 경우
				   System.out.println("올바른 입력이 아닙니다.");
			}
			System.out.println("계속하시겠습니까? (Y,y)");
			answer  = sc.next();
		} while (answer.equals("Y") || answer.equals("y")); // Y 인경우 반복실행
		System.out.println("계산기종료");
	}
}
