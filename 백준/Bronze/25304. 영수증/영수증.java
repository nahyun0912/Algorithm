import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int i = sc.nextInt();
		int sum = 0;
		for(int j=0;j<i;j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum+=(a*b);
		}
		if(sum==price) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}