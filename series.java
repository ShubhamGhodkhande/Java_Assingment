import java.util.Scanner;
public class series {
	public static void main(String[] args)
	{
		int n,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n");
		n = sc.nextInt();
		
		for(int i = 1;i<=n;i++)
		{
			sum += i;
			
		}
		System.out.println("Sum of n values is "+sum);
	}
}
