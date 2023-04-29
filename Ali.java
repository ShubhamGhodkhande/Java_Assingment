import java.util.Scanner;
public class Ali {

	public static void main(String[] args) {
		
		/* IMPORTANT: Multiple classes and nested static classes are supported */

		/*
		 * uncomment this if you want to read input.
		//imports for BufferedReader
		import java.io.BufferedReader;
		import java.io.InputStreamReader;

		//import for Scanner and other utility classes
		import java.util.*;
		*/

		// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
//		import java.util.Scanner;
//		class TestClass {
//		    public static void main(String args[] ) throws Exception {
		        /* Sample code to perform I/O:
		         * Use either of these methods for input

		        //BufferedReader
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        String name = br.readLine();                // Reading input from STDIN
		        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

		        //Scanner
		        Scanner s = new Scanner(System.in);
		        String name = s.nextLine();                 // Reading input from STDIN
		        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

		        */
		        
		        // Write your code here
		    Scanner sc=new Scanner(System.in);
		    String s=sc.next();
		    int pair1=s.charAt(0)-48 +s.charAt(1)-48;
		    int pair2=s.charAt(1)-48+s.charAt(3)-48;
		    int pair3=s.charAt(3)-48+s.charAt(4)-48;
		    int pair4=s.charAt(4)-48+s.charAt(5)-48;
		    int pair5=s.charAt(5)-48+s.charAt(7)-48;
		    int pair6=s.charAt(7)-48+s.charAt(8)-48;
		    char v=s.charAt(2);
		    char d=s.charAt(6);
		    if(pair1%2==0 && pair2%2==0 && pair3%2==0 && pair4%2==0 && pair5%2==0 && pair6%2==0 ){
		        if(v=='A'||v=='E'||v=='I'||v=='O'||v=='U'||v=='Y'&& d=='-'){
		                    System.out.println("valid");
		        }
		    }else{
		                System.out.println("invalid");
		    }


	}

}
