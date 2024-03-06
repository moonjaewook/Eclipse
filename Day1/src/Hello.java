/*
 * java는 100% 상속구조
 * java는 100% 객체지향언어이다 -> 무조건 객체를 사용. -> class
 * 
 * 시작과 끝을 담당하는 함수 => main 함수
 * 함수 => function => method
 * 
 * 이름 규칙
 * 1. 클래스 : 첫글자는 대문자로 작성 - 약속임
 * 2. 메소드, 변수(상수를 저장하는 메모리 공간) : 소문자 작성
 * 3. 상수 : 전부 대문자 ex. MAX - 변하지 않는 값
 * 4. 단어와 단어가 이어질 때 두번째 단어의 첫글자는 대문자로 작성 ex. blackWhite, BlackWhite
 * 
 * DataType
 * 1. 
 * 	  문자형 char 2byte
 *    정수형 byte, short, int, long
 *    실수형 float, double
 *    
 * 2. Reference Type : 레퍼런스 변수를 사용
 *    - 배열
 *    - 객체
 *    - enum.
 * casting
 * 1. 자동형변환 3 + 4.2 -> int + double -> 3.0 + 4.2 = 7.2 (큰개념으로 자동형변환되어 계산됨)
 * 2. 강제형변환 3/4 = 0 -> int / int = int 
 *            (double)3/(double)4 = 0.75 (3,4 둘중에 하나만 써줘도 자동형변환에 의해 계산됨)
 * 
 *
 */

//public class Hello {
//	
//	public static void main(String []args) {	//프로그램을 시작해주고 끝내줌.
//		
//		// datatype 변수명;
//		// 변수명 = 값; = 은 대입 == 초기화
//		// 변수 - 지역변수 local variable : method 안에 선언되어지는 변수
//		//                              항상 꼭 초기화를 해야한다. ★★★★★★★★
//		
//		int num;
//		num  = 10;
//		
//		char ch = 'A'; // "" 문자열 '' 문자
//		
//		System.out.println(num);
//		System.out.println((int)ch);
//		
//		Hello hello; // hello는 레퍼런스변수
//		hello = new Hello(); // 객체생성
//	}
//}



//패키지
//임포트 : api 가져다 쓰겠다
//import java.lang.*;
//import java.util.Scanner;
//
//public class Hello {
//	
//	public static void main(String []args) {
//		
//		Scanner sc;
//		sc = new Scanner(System.in);
//		
//		String str = sc.next();
//		int num = sc.nextInt();
//		
//		System.out.println(str);
//		System.out.println(num);
//		
////		System.out.println("Hello");
////		System.out.println(333);
////		
////		System.out.print("Hello" + 333);
////		System.out.print(333);
//	}
//}


//import java.util.Scanner;
//
//public class Hello {
//	
//	public static void main(String []args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("a를 입력해주세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("b를 입력해주세요.");
//		int b = sc.nextInt();
//
//		
//		if (a > b)
//		{
//			System.out.println("a가 b보다 큽니다.");
//		}
//		if (b > a)
//		{
//			System.out.println("b가 a보다 큽니다.");
//		}
//		if (a == b)
//		{
//			System.out.println("a와 b가 같습니다.");
//		}
//		
//	}
//}




