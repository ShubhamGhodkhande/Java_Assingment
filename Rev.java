import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int temp=num;
		int rem;
		int res=0;
		while(num>0) {
			rem=num%10;
			res=res*10+rem;
			num/=10;
		}System.out.println(res);

	}

}
