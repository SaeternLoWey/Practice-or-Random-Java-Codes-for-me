import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReaderExampleRefactored {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		BufferedReader reader = null;
		BufferedWriter writer = null;
		FileReader fr = null;
		FileWriter fw = null;
		Boolean toAppend;
		String strUserInput;
		String strFileToWriteTo;
		String strFileToReadFrom;
		int intUserInput;
		
		
		
		
		System.out.println("Would you like to read or write to a file?");
		System.out.println("Please enter '1' to read to a file or '2' to write to a file: ");
		intUserInput = scan.nextInt();
		
		while(!(intUserInput ==1 || intUserInput == 2)) {
			System.out.println("Please enter '1' to read or '2' to write");
			intUserInput = scan.nextInt();
		}
		
		
		if(intUserInput == 1) {
			System.out.println("You have selected to read to a file");
			System.out.println("Please enter the filename: ");
			strFileToReadFrom = scan.next() + ".txt";
			System.out.println("You are reading from: " + strFileToReadFrom);
			System.out.println("Now Reading from file: " + strFileToReadFrom);
			ReadFromFile(reader, fr, strFileToReadFrom);
		}
		
		else if(intUserInput == 2 ) {
			System.out.println("You have selected to write to a file");
			System.out.println("Please enter the filename to write to: ");
			strFileToWriteTo = "src\\" +scan.next() +".txt";
			System.out.println("You have entered to write to : " + strFileToWriteTo);
			System.out.println("Now do you want to add to the existing file or do you want to overwrite the contexts of the file?");
			System.out.println("Please enter '3' to append(add) to the file or '4' to overwrite the file: ");
			
			intUserInput = scan.nextInt();
			
			while(!(intUserInput ==3 || intUserInput == 4)) {
				System.out.println("You have entered an invalid input");
				System.out.println("Please enter '3' to append(add) to the file or '4' to overwrite the file: ");
				intUserInput = scan.nextInt();
			}
			
			if(intUserInput == 3) {
				System.out.println("You have chosen to add to a file");
				WriteToFile(writer,fw,strFileToWriteTo,true, scan);
			}
			else if(intUserInput == 4) {
				System.out.println("You have chosen to overwrite the contents in the file");
				WriteToFile(writer,fw,strFileToWriteTo,false, scan);
			}
			
			
		}
		
		System.out.println();
		scan.close();
		System.out.println("At bottom of program");
		
	}
	
	
	public static void ReadFromFile(BufferedReader read, FileReader fr, String strFileToReadFrom) {
		
		String strCurRead;
		try {
			fr = new FileReader("src\\" + strFileToReadFrom);
			read = new BufferedReader(fr);
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not read file to bufferedreader");
			e.printStackTrace();
		}
		
		try {
			while((strCurRead = read.readLine()) != null) {
				System.out.println("Now printing data read from: " + strFileToReadFrom);
				System.out.println(strCurRead);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				if(read != null) {
					read.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("Finished Reading File.");
			System.out.println("Now exiting program");
			System.exit(1);
		}
	}
	
	public static void WriteToFile(BufferedWriter wr, FileWriter fw, String strFileToWriteTo, Boolean boolToAppend, Scanner scan) {
		
		String textToWriteToFile;
		
		if(boolToAppend == true) {
			try {
				fw = new FileWriter(strFileToWriteTo, boolToAppend);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
			wr = new BufferedWriter(fw);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Please enter what you would like to append to your file: ");
			textToWriteToFile = scan.nextLine();
			textToWriteToFile = " " + scan.nextLine();
		
			try {
				
				fw.append(textToWriteToFile);
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					wr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		else if(boolToAppend == false) {
			try {
				fw = new FileWriter(strFileToWriteTo, boolToAppend);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				wr = new BufferedWriter(fw);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("Please enter what you would like to write to your file: ");
			textToWriteToFile = scan.nextLine();
			textToWriteToFile = scan.nextLine();
			try {
				
				wr.write(textToWriteToFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					wr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Successfully written to file: " + strFileToWriteTo);
	}
	


}
