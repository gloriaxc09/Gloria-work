package CapStoneProject;
import java.util.Random;
/**
 * 
 */
/**
 * @author gloriachavez
 *
 */

import java.util.Scanner;
public class CapStoneProject{

	private static Scanner scanner;

	public static void main(String[] args){
	
		System.out.println("Welcome to my Username Generator and Average Calculator");
		
		System.out.println("*********************************************************");
		
		System.out.print("You will be asked to enter first name and the last name "
				+ "of a person and the program will create a user name for you."
				+ "It will also calculate the average of the testscores of the group"
				+ "and assign this group of users a letter grade.");
	{
		
		scanner = new Scanner(System.in);
		System.out.print("How many usernames would you like to create? ");
		@SuppressWarnings("unused")
		int num = scanner.nextInt();
	
	
		try (Scanner sc1 = new Scanner(System.in)) {
			System.out.println("Enter first name : ");
			String firstName=sc1.nextLine();

			System.out.println("Enter last name : ");
			String lastName=sc1.nextLine();

			Random num1 = new Random();

			int Low=10;

			int High=99;

			System.out.println(firstName.charAt(0)+lastName.substring(0, 4)+(num1.nextInt(High-Low) + Low));
			
			
			    try (Scanner sc11 = new Scanner(System.in)) {
					System.out.println("Enter first name : ");
					String firstName2=sc11.next();

					System.out.println("Enter last name : ");
					String lastName2=sc11.next();

					Random num2 = new Random();
					
					int Low1=10;
					int High1=99;

					System.out.println(firstName2.charAt(0)+lastName2.substring(0, 4)+(num2.nextInt(High1-Low1) + Low1));
				
				try (Scanner sc111 = new Scanner(System.in)) {
					System.out.println("Enter first name : ");
					String firstName3=sc111.next();

					System.out.println("Enter last name : ");
					String lastName3=sc111.next();
					
					Random num3 = new Random();
					System.out.println(firstName3.charAt(0)+lastName3.substring(0, 4)+(num3.nextInt(High1-Low1) + Low1));}
					

   				    String username1 = new String(" ");
   				    String username2 = new String(" ");
   				    String username3 = new String(" ");
			    
   				    userName(username1, username2, username3);}}}}
				
					static void userName(String username1, String username2, String username3) {
					
					String input;
					double score1, score2, score3;
					double average;
					char repeat;
					
					try (Scanner keyboard = new Scanner(System.in)) {
						System.out.print("This program calculates the average of three test scores.");
						
						do
						{
							System.out.print("Please enter a test score for" + username1);
							score1 = keyboard.nextDouble();
							System.out.print("Please enter a test score for" + username2);
							score2 = keyboard.nextDouble();
							System.out.print("Please enter a test score for" + username3);
							score3 = keyboard.nextDouble();
							
							// Calculate and print the average of test scores.
							average = (score1 + score2 + score3) / 3.0;
							System.out.println("The average is" + average);
							System.out.println();
							
							// Ask user if they want another set of test scores.
							System.out.println("Would you like to average another set of test scores?");
							
							System.out.println("Enter Y for yes or quit for no: ");
							input = keyboard.next();
							repeat = input.charAt(1);}
							
							while (repeat == 'Y' || repeat == 'y');
					}
					
					{
						
						boolean quit = false;
						if(quit)
							System.out.println("Thank you for using this system. Have a great day!");
					}
				}
			 }				 
					 
				
		
			
		


	
		

	
			

			
		
	
		

