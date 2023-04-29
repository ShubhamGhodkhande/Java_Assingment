import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size =sc.nextInt();
		int [] array = new int [size];
		System.out.println("Enter the elements");
		int l=0;
		while (l<size) {
			array[l]=sc.nextInt();
			l++;
		}
		int flag;
		for (int i=0;i<size;i++) {
			flag=1;
			for(int j=i+1;j<size;j++) {
				if(array[i]==-1) {
					break;
				}else if (array[i]==array[j]) {
					flag++;
					array[j]=-1;
				}
			}if(array[i]!=-1) {
				System.out.println(array[i]+" occurs "+flag+" times");
				array[i]=-1;
			}
		}
	}
}
