import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] x = new int[a];
		for(int i=0; i<a;i++) {
			x[i] = sc.nextInt();
		}
		int y = sc.nextInt();
		int sum = 0;
		for(int i=0;i<x.length;i++) {
			if(x[i]==y) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
