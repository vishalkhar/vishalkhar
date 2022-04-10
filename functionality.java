package firstPackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class functionality {

	Scanner sc = new Scanner(System.in);
	static List<String> list = new ArrayList<String>();
	
	public void displayFiles() {                      //METHOD TO DISPLAY 
		try { 
		    Collections.sort(list);
			System.out.println(list);
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("\n");
	}

	public void addFiles() {                           //METHOD TO ADD
		System.out.println("ENTER THE NAME OF FILE YOU WANT TO ADD");
		
		String fileName = sc.nextLine();
		
		
		
		if(list.contains(fileName)) {
			
			System.out.println("FILE ALREADY EXISTS");
		}
		else {
			   list.add(fileName);
		      System.out.println("FILE ADDED SUCCESSFULLY");
		}
		System.out.println("\n");
		
	}

	public void deleteFiles() {                 //METHOD TO DELETE
		
		System.out.println("ENTER THE NAME OF FILE YOU WANT TO DELETE");
		String fileName = sc.nextLine();
		
		if(list.contains(fileName)) {
			list.remove(fileName);
			System.out.println("FILE SUCCESSFULLY DELETED");
		}
		else {
		System.out.println("FILE NOT FOUND");
	}
		System.out.println("\n");
	}
	
	public void searchFiles() {                 //METHOD TO SEARCH
		
		System.out.println("ENTER THE NAME OF FILE YOU WANT TO SEARCH");
		String fileName = sc.nextLine();
		if(list.contains(fileName)) {
			System.out.println("FILE EXISTS");
		}
		else 
			System.out.println("FILE DO NOT EXIST");
		
		System.out.println("\n");
	}


	public void closeApplication() {           // METHOD TO CLOSE THE APPLICATION
		
		System.out.println("\n");
		System.out.println("Application closed");
		
		
	}

	public void welcomeScreen() {
		System.out.println("WELCOME TO LOCKEDME");
		System.out.println("DEVELOPED BY VISHAL KHARBANDA \n");
		System.out.println("PRESS 1 TO DISPLAY THE FILES");
		System.out.println("PRESS 2 TO ADD THE FILES");
		System.out.println("PRESS 3 TO DELETE THE FILES");
		System.out.println("PRESS 4 TO SEARCH THE FILES");

		System.out.println("PRESS 5 TO CLOSE THE FILE APPLICATION");
		
		
	}
}
