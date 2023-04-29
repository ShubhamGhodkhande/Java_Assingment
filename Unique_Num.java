import java.util.Scanner;

public class Unique_Num {

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
		for (int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[i]==-1) {
					break;
				}else if (array[i]==array[j]) {
					array[j]=-1;
				}
			}if(array[i]!=-1) {
				System.out.println(array[i]+" ");
				array[i]=-1;
			}
		}
	}
}
