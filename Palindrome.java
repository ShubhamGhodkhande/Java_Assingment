import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter number");
		int n =sc.nextInt();
		int temp=n;
		int ans=0;
		int rem;
		while(n>0) {
			rem=n%10;
			ans=ans*10+rem;
			n/=10;
		}n=temp;
		if(ans==temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not");
		}
	}

}
