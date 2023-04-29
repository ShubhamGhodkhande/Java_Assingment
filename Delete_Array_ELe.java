package dfghj;

import java.util.Arrays;

public class Delete_Array_ELe {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int[] array=new int[arr.length-1];
		int k=3;
		int n=arr.length;
//		if(k<0||k>arr.length) {
//			System.out.println("Invalid");
//		}
//		else {
//			for(int i=k-1;i<n;i++) {
//				arr[i]=arr[i+1];
//				n--;
//			}
//			
//		}
		
		int index=0;
//		System.out.println(Arrays.toString(arr));
//		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==3) {
				
			}else {
				array[index++]=arr[j];
			}
		}
		System.out.println(Arrays.toString(array));
		

	}

}
