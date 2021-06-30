import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a number 1 - 6: ");
		int dayOfWeek = scan.nextInt();
		
		switch(dayOfWeek) {
			
			case 0: 
				System.out.println("Sunday");
				break;
			
			case 1:
				System.out.println("Monday");
				break;
				
			case 2:
				System.out.println("Tuesday");
				break;
				
			case 3:
				System.out.println("Wednesday");
				break;
				
			case 4:
				System.out.println("Thursday");
				break;
				
			case 5:
				System.out.println("Friday");
				break;
				
			case 6:
				System.out.println("Saturday");
				break;
				
			default: 
				System.out.println("Please enter a number from 1 to 6");
		}
	}
}
