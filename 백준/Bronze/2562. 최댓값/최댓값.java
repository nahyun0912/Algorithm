import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] x = new int[9];
		int max = x[0];
		int sum = 1;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<x.length;i++) {
			x[i] = sc.nextInt();
			if(x[i]>=max) {
				max = x[i];
				sum = i+1;
			}
		}
		System.out.println(max);
		System.out.println(sum);
	}
}