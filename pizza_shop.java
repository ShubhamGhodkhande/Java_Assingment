import java.util.Scanner;
public class pizza_shop {
	public static void main(String[] args) {
		int ch,amount = 0,qty;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter choice");
			System.out.println("1.Margherita Pizza 300\n2.Corn and onion Pizza 250\n3.Paneer Pizza 200\n4.Cheesy Pizza 150\n5.Total amount");
			
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter quantity");
				qty = sc.nextInt();
				amount += qty*300;
				break;
			case 2:
				System.out.println("Enter quantity");
				qty = sc.nextInt();
				amount += qty*250;
				break;
			case 3:
				System.out.println("Enter quantity");
				qty = sc.nextInt();
				amount += qty*200;
				break;
			case 4:
				System.out.println("Enter quantity");
				qty = sc.nextInt();
				amount += qty*150;
				break;
			case 5:
				System.out.println("Total amount :"+amount);
				System.out.println("Thank You...Visit again");
				break;
			default:
				System.out.println("Please choose another option");
				
			}
		}while(ch!=5);
		
		
		
	}

}
