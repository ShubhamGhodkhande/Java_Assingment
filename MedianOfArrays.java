
public class MedianOfArrays {

	public static void main(String[] args) {
		int []nums1= {8,5,2};
		int []nums2= {7,1,4};
        int m=nums1.length;
        int n=nums2.length;
        int []arr=new int [m+n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }
        while (i < m) {
            arr[k++] = nums1[i++];
        }
        while (j < n) {
            arr[k++] = nums2[j++];
        }
        if ((m + n) % 2 == 0) {
            int mid = (m + n) / 2;
            return (double) (arr[mid - 1] + arr[mid]) / 2.0;
        } else {
            int mid = (m + n) / 2;
            return (double) arr[mid];
        }

        
        
//        
//        int []arr=new int [m+n];
//        for(int i=0;i<m;i++){
//            arr[i]=nums1[i];
//        }
//        int l=0;
//        for(int j=m;j<n;j++){
//            arr[j]=nums2[l];
//            l++;
//        }
//
//        int temp=0;
//		        for (int p=0;p<arr.length;p++){
//		            for(int q=p+1;q<arr.length;q++){
//		                if(arr[q]<arr[p]){
//		                    temp=arr[q];
//		                    arr[q]=arr[p];
//		                    arr[p]=temp;
//		                }
//		            }
//		        }
//        
//		        System.out.println((arr[arr.length/2]+arr[(arr.length/2)+1])/2);
//        }

	}

}
