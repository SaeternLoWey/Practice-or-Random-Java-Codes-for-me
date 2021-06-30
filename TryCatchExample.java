import java.util.Arrays;
import java.util.Scanner;

public class TryCatchExample {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Please Enter a number: ");
			int x =  scan.nextInt();
			System.out.println("Your number entered is: " + x);
			scan.close();
		}
		catch(Exception e) {
			System.out.println("You did not enter a number or an integer");
		}
		
		
		int [] arr = new int [3];
		arr [0] = 1;
		arr [1] = 2;
		arr [2] = 3;
		
		try {
			System.out.println(arr[4]);
		}
		
		catch(NullPointerException e) {
			System.out.println("Bro you arent getting anything from arr array");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Bro you are getting something out of bounds from arr array");
		}
		catch(Exception e) {
			System.out.println("Bro something is wrong with your arr array");
		}
		
	
	}

}
