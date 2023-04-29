
public class KthSmallest {

	public static void main(String[] args) {
		int []arr= {5,8,3,9,4,1,5,6};
		int smallest = Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondsmallest = smallest;
				smallest=arr[i];
			}else if(arr[i]<secondsmallest) {
				secondsmallest=arr[i];
			}
		}System.out.println(secondsmallest);
	}

}
