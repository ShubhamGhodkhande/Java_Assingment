import java.util.Scanner;
public class allPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		for(int i=2; i<=n; i++)
		{
			int count = 0;
			for(int j = 1;j<=i;j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			if(count == 2) {
			System.out.print(i+" ");
			}
		}

	}

}
