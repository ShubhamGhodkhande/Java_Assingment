import java.util.Arrays;

public class RotateByK {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int j;
		int k = 4;
		while (k > 0) {
			int temp = arr[arr.length - 1];

			for (j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			
			arr[j] = temp;
			k--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
