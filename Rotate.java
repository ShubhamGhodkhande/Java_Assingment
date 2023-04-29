import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements");
		int l = 0;
		while (l < size) {
			array[l] = sc.nextInt();
			l++;
		}
		int k=sc.nextInt();
		int temp;
	for(int j=1;j<=k;j++) {	
		for(int i=0;i<size;i++) {
			temp=array[size-1];
			int t=array[i+1];
			array[i+1]=array[i];
			array[i]=temp;
			i--;
			j++;
			System.out.print(array[i]+" ");
		}
	}
		
//		for(int i=0;i<size;i++) {
//			temp=array[i];
//			array[i]=array[size-1];
//			array[size-1]=temp;
//			System.out.print(array[i]+" ");
//		}
	}

}
