import java.util.Scanner;

public class Decimal_To_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number");
		int num = sc.nextInt();
		int power =1;
		int ans =0;
		while(num!=0) {
			int digit = num%10;
			ans = ans+power*digit;
			power =power*2;
			num/=10;
			
		}
		System.out.println(ans);
	}
}
