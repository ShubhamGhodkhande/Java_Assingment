import java.util.Scanner;
public class sumEvenOdd {

	public static void main(String[] args) {
		int n,isEven=0 , isOdd=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n:");
		n = sc.nextInt();
		for(int i=1; i<=n ; i++) {
			if(i%2==0) {
				isEven += i;
			}else
				isOdd += i;
		}
		System.out.println("Sum of Even numbers till n = "+isEven);
		System.out.println("Sum of Odd numbers till n = "+isOdd);
	}

}
