import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[10];
		int y[] = new int[10];
		for(int i=0;i<10;i++) {
			x[i] = sc.nextInt();
			y[i] = x[i] % 42;
		}
		int[] y2 = Arrays.stream(y).distinct().toArray();
		System.out.println(y2.length);
	}
}
