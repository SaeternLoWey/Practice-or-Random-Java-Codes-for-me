import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferReaderExample {
	
	public static void main(String [] args ) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		String strCurrentLine;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader("src\\RandomText.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot find the file bro make sure file path is correct");
		}
		try {
			while((strCurrentLine = reader.readLine()) != null) {
				System.out.println("Now outputing text from file");
				System.out.println("");
				System.out.println(strCurrentLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Trouble reading in input from the text and putting it in the strCurrentLine String.");
			e.printStackTrace();
		}
		finally {
			
			try {
				if(reader != null) {
					reader.close();
				}
			}
			catch (IOException ex) {
				
			ex.printStackTrace();
				
			}
			
				
			
		}
		
		
		System.out.println("Do you want to write to a file bro?");
		System.out.println("Type in 'Y' for yes and 'N' for no : " );
		
		try {
		String strUserWrite = scan.nextLine();
		
		if(strUserWrite.equals("Y")) {
			try {
				writer = new BufferedWriter(new FileWriter("output.txt", true));
				
				
				try {
					
					System.out.println("Do you want to add to the file? Or do you want to overwrite it's contents?");
					System.out.println("Type in \"Add\" to add to the file or \"Overwrite\" to Overwrite it's current contents");
					String userInput = scan.nextLine();
					if(userInput.equals("Add")) {
						System.out.println("You have chosen to add to the file");
						System.out.println("Please add what you want to add to the file: ");
						userInput = scan.nextLine();
						
						writer.append(userInput);
					
					}
					else if (userInput.equals("Overwrite")) {
						System.out.println("You have chosen to overwrite the file");
						System.out.println("Please add the text that you want to add to the file");
						userInput = scan.nextLine();
						writer.write(userInput);
					}
					else {
						System.out.println("Error Wrong input for input");
					}
					
					
				}
				catch(Exception e) {
					System.out.println("Something is wrong with reading input from the user from scanner");
					e.printStackTrace();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					System.out.println("You have successfully saved to a file!!!");
				writer.close();
				scan.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		else if(strUserWrite.equals("N")) {
			System.out.println("You selected not to write to a file");
			try {
				System.out.println("Now closing scanner ");
			scan.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Wrong input bro");
			System.out.println("Now exiting program because i said so");
			System.exit(1);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("You did not enter the proper input");
		}
		
		
	}

}
