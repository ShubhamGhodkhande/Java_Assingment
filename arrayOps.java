import java.util.Scanner;
public class arrayOps {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n,key,choice,sum=0,flag=0;
		System.out.println("Enter the size of Array:");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("1:Read Array\n 2:Print Array\n 3:Search element in array\n 4:Reverse Array\n 5:Even number from array\n 6:sum of array element\n 7:Exit");
		do {
			System.out.println("Enter choice:");
			choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter elements of an array\n");
				for(int i=0; i<n; i++) {
					arr[i] = sc.nextInt();
				}
				break;
			case 2:
				System.out.println("Printing array:");
				for(int i=0; i<n; i++) {
					System.out.print(arr[i]+ " ");
				}break;
			case 3:
				System.out.println("Enter the element:");
				key=sc.nextInt();
				
				for(int i=0; i<n; i++){
					if(key==arr[i]) {
						flag++;
					}
				}if(flag!=0) {
						System.out.println("Key is present");
					}else {
						System.out.println("Key is not present");
					}break;
			case 4:
				System.out.println("Enter elements of an array\n");
				
				System.out.println("Reversed array:");
				for(int i=n-1; i>=0; i--) {
					System.out.print(arr[i]+ " ");
			}break;
			case 5:
				for(int i = 0;i<n;i++) {
					if(arr[i]%2 == 0) {
						System.out.print(arr[i]+" ");
					}
					
				}
				break;
			case 6:
				for(int i = 0;i<n;i++) {
					sum += arr[i];
				}
				System.out.println("Sum of elements in array is "+sum);
				break;
			default:
				System.out.println("Invalid choice");
			
			}
			
				
		}while(choice!=7);

		}
		
}

	