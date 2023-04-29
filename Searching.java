import java.util.Scanner;

public class Searching {

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
		int flag = 0;
		System.out.println("Enter number");
		int key = sc.nextInt();
		for (int i = 0; i < size; i++) {
			if (key == array[i]) {
				flag++;
			}
		}
		if (flag != 0) {
			System.out.println("Key is present");
		} else {
			System.out.println("Key not present");
		}
	}

}
