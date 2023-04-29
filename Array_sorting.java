import java.util.Scanner;

public class Array_sorting {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int [] array = new int [size];
		System.out.println("Enter the elements in the array");
		int i=0;
		int temp;
		while (i<size) {
			array[i] = sc.nextInt();
			i++;
		}
		for(int i1=0;i1<size-1;i1++) {
			for(int j=i1+1;j<size;j++) {
				if(array[i1]>array[j]) {
					temp = array[i1];
					array[i1]=array[j];
					array[j]=temp;
				}
			}
		}System.out.println("After sorting");
		for(int k =0;k<size;k++) {
			System.out.print(array[k]+" ");
		}
	}

}
