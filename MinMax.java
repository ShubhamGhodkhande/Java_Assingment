import java.util.Scanner;

public class MinMax {

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
		int max,min;
		max=array[0];
		min=array[0];
		for (int i=1;i<size;i++) {
			if(array[i]>max) {
				max=array[i];
			}
			if(min>array[i]) {
				min=array[i];
			}
		}
		int range = max-min;
		System.out.println("Maximum = "+max+" Minimum = "+min+" Range = "+range);
	}

}
