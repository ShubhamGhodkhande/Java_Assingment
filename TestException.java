package Tester;
import java.util.Scanner;

import static Validation_Rules.ValidatingRules.*;


public class TestException {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter speed");
			ValidateSpeed(sc.nextInt());
			System.out.println("Enter License Exp Date : (day-month-year)");
			ValidateLicense(sc.next());
			System.out.println("End of try");
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
			
		}
		System.out.println("-----Main over-----");

	}
	

}
