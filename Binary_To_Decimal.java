import java.util.Scanner;

public class Binary_To_Decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int binary []=new int [32];
		int i;
		for(i=0;num>0;i++) {
			binary[i]=num%2;
			num/=2;
		}for(int j=i-1;j>=0;j--) {
			System.out.print(binary[j]+" ");
		}
	}

}
