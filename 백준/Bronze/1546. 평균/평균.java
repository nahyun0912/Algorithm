import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double m[] = new double[n];
		double max = 0;
		double sum = 0;
		for(int i=0;i<n;i++) {
			m[i]=sc.nextInt();
			if(max<=m[i]) {
				max=m[i];
			}
		}
		for(int i=0;i<n;i++) {
			m[i] = m[i]/max*100;
			sum +=m[i];
		}
		System.out.println(sum/n);
	}
}
