import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[]digits= {5,9};
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
				break;
			}
			digits[i] = 0;
		}

		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
		        
		
		
		
		
		
		

//		
		
		
		
		
//		int [] arr = {4,1,5,8};
//		int sum=0;
//		int j=0;
//		
//		for(int i=arr.length-1;i>=0;i--) {
//			sum=(int) (sum+Math.pow(10,j)*arr[i]);
//			j++;
//		}
//		
//			System.out.println(sum+1);
	}

}
