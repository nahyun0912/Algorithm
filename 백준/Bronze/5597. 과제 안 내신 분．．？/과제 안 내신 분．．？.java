import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] x = new boolean[31];
		for(int i=0;i<28;i++) {
			x[sc.nextInt()]=true;
		}
		for(int i=1;i<=30;i++) {
			if(!x[i]) {
				System.out.println(i);
			}
		}
	}
}