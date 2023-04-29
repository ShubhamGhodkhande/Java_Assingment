package dfghj;
import java.util.Scanner;
public class pass {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a password with at least 8 characters, including at least one symbol, one number, one uppercase character, and one lowercase character:");
	        String password = scanner.nextLine();

	        String symbol = "[!@#$%^&*]";
	        String number = "[0-9]";
	        String upper = "[A-Z]";
	        String lower = "[a-z]";

	        if (password.length() < 8) {
	            System.out.println("Password must have at least 8 characters");
	        } else if (!password.matches(".*" + symbol + ".*")) {
	            System.out.println("Password must contain at least one symbol");
	        } else if (!password.matches(".*" + number + ".*")) {
	            System.out.println("Password must contain at least one number");
	        } else if (!password.matches(".*" + upper + ".*")) {
	            System.out.println("Password must contain at least one uppercase letter");
	        } else if (!password.matches(".*" + lower + ".*")) {
	            System.out.println("Password must contain at least one lowercase letter");
	        } else {
	            System.out.println("Password is valid");
	        }

	        scanner.close();

	}

}
