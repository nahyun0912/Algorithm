import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] x = new int[a];
		for(int i=0;i<x.length;i++) {
			x[i]=sc.nextInt();
		}
		Arrays.sort(x);
		System.out.println(x[0]+" "+x[a-1]);
	}
}