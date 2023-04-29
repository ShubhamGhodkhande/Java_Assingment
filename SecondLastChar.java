package dfghj;
import java.util.Scanner;
public class SecondLastChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		System.out.println("Enter character");
		char c=sc.next().charAt(0);
		int n=s.length();
		int a=0;
		char [] arr=new char[n];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				arr[a]=s.charAt(i);
				a++;
			}
			
		}
		if(a==0) {
			System.out.println("Not present");
		}else if(a==1) {
			System.out.println("No two occurance");
		}else {
			System.out.println(c+" is present at "+(a-1)+" index");
		}
	}

}
