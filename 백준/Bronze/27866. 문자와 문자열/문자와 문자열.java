import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		int y = sc.nextInt();
		System.out.println(x.charAt(y-1));
		
	}
}