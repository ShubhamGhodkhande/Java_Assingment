package dfghj;

public class sum_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6,7};
		int sum=9;
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			
			if((arr[low]+arr[high])>9) {
				high--;
			}else if((arr[low]+arr[high])<9) {
				low++;
			}else if((arr[low]+arr[high])==9) {
				System.out.println("("+arr[low]+","+arr[high]+")");
			}
		}
	}

}
