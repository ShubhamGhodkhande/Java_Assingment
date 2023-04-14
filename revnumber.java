import java.util.Scanner;
public class revnumber {
	public static void main(String [] args) {
		int n,revnum = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		
		while(n!=0) {
			int r = n % 10;
			n = n / 10;
			revnum = revnum*10 + r;
		}
		System.out.println("Reverse number is "+ revnum);
	}

}

