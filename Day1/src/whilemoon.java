
public class whilemoon {
	public static void main(String []args) {
		int i = 1;
		while(i<10) {
			int j = 2;
			while(j<10) {
				System.out.print((j)+"*"+(i)+"="+(i*j)+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}