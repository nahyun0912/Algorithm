import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] x = new int[a];
		for(int i=0;i<x.length;i++) {
			x[i]=sc.nextInt();
			if(x[i]<b) {
				System.out.print(x[i]+" ");
			}
		}
	}
}