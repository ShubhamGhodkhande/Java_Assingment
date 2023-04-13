import java.util.Scanner;
public class exponent {
	public static void main(String[] args) {
		int m,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of m");
		m = sc.nextInt();
		System.out.println("Enter value of n");
		n = sc.nextInt();
		
		int result = 1;
		
		for(int i = 1; i <=n;i++) {
			result *= m;
			
		}
		System.out.println(m+"^"+n+" = "+ result);
	}

}
