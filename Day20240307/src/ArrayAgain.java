import java.util.Scanner;

public class ArrayAgain {
	public static void main(String[] args) {

		String []name = new String[3]; //이름
		int [][]score = new int[3][4]; //국,영,수,총
		float []avg = new float[3]; //평균
		
		String []scoName = {"Name", "Kor", "Eng", "MAt", "Total", "Avg"};
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			
			//System.out.println("이름/국어/영어/수학 순으로 입력하세요.");
			//name[i] = sc.next(); //이름 선입력
			nameInput(scoName,name,sc,i); //잘 이해를 못함 ㅠ
			
			for (int j = 0; j < 3; j++) { //i는 고정한채로 j를 순차적으로 입력 (국,영,수)

				score[i][j] = sc.nextInt();
				score[i][3] += score[i][j]; //마지막 합계는 누적으로 계속 더하기
			}
			avg[i] = score[i][3] / 3.f; //합계를 평균 배열에 넣어주기
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.print(name[i]+"\t"); // 우선 이름 선호출
			for (int j = 0; j < 4; j++) {
				System.out.print(scoName[i+1]+score[i][j]+"\t"); // 학생별로 점수를 쭉 불러준다.
			}
			System.out.print(avg[i]); //학생별로 점수를 부른 후 합계를 3으로 나눠주기
			System.out.println();
		}
	}
	
	public static void nameInput(String[] scoName, String[] name, Scanner sc, int i) {
		System.out.println(scoName[0]+"input: ");
		name[i] = sc.next();
	}
	
	public static void scoreInput(String[] scoName, )
	

}