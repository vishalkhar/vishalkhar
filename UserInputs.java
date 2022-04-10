package firstPackage;

import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {
	
                  try (Scanner sc = new Scanner(System.in)) {
			
					functionality f = new functionality();
					
					int i=0;
					while(i<1) {
						f.welcomeScreen();
					
					int userInput = sc.nextInt();
					{
					
					switch(userInput) {
					
					case 1:
						 f.displayFiles();
						 System.out.println("PRESS 1 TO GO BACK TO WELCOME SCREEN ");
						 System.out.println("<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
						 int s = sc.nextInt();
						 if(s==1) {
							 continue;
						 }
						 System.out.println("SORRY! YOU ENTERED THE WRONG NUMBER");
						 break;
						 
					case 2:
						 f.addFiles();
						 System.out.println("PRESS 1 TO GO BACK TO WELCOME SCREEN ");
						 System.out.println("<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
						 int n = sc.nextInt();
						 if(n==1) {
							 continue;
						 }
						 System.out.println("SORRY! YOU ENTERED THE WRONG NUMBER");
						 break;
						 
					case 3:
						 f.deleteFiles();
						 System.out.println("PRESS 1 TO GO BACK TO WELCOME SCREEN ");
						 System.out.println("<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
						 int t = sc.nextInt();
						 if(t==1) {
							 continue;
						 }
						 System.out.println("SORRY! YOU ENTERED THE WRONG NUMBER");
						 break;
						 
					case 4:
						f.searchFiles();
						System.out.println("PRESS 1 TO GO BACK TO WELCOME SCREEN");
						 System.out.println("<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
						 int m = sc.nextInt();
						 if(m==1) {
							 continue;
						 }
						 System.out.println("SORRY! YOU ENTERED THE WRONG NUMBER");
						 break;
					
					case 5:
						f.closeApplication();
						break;
						
					default:
						System.out.println("PLEASE ENTER THE VALID NUMBER ");
						continue;
					}
	               }
					    break;
	              }
				}
				        System.out.println("THANKYOU");
			}
		}
		 
				
		