package phonenumbervalidator;

import java.util.Scanner;

public class PhoneNumberValidator_Driver {

	
	
	
	
	
	
	public static void main(String[] args) {

		
		/* Challenge 1 */

//		String num1 = "0123456789";
//		String num2 = "(012) 345-6789";
//		String num3 = "012-345-6789";
//		String num4 = "000911000";
//		String num5 = "(111) 911-2084";
//		
//		
//		PhoneNumberValidator pnv = new PhoneNumberValidator();
//		
//		System.out.println(pnv.validatePhoneNumber(num1));
//		System.out.println(pnv.validatePhoneNumber(num2));
//		System.out.println(pnv.validatePhoneNumber(num3));
//		System.out.println(pnv.validatePhoneNumber(num4));
//		System.out.println(pnv.validatePhoneNumber(num5));
		
		
		
		
		/* Bonus Challenge */
		
		driver1();
		
		
		
	}

	
	
	
	public static void driver1() {
		
		Scanner scan = new Scanner(System.in);
		int choice = 1;		// menu choice, default: menu start
		
		while(choice != 2)
		{
			/* Launch menu and get choice */
			menu();
			choice = scan.nextInt();
			
			
			/* choice = 1: check phone number */
			
			if(choice == 1)
			{
				System.out.println("\nPlease enter a phone number ...\n");
				
				scan.nextLine();	// clear scanner buffer: will cause problem after using nextInt() prior
				String phoneNumber = scan.nextLine();
				
				if(PhoneNumberValidator.validatePhoneNumber(phoneNumber) == true)
				{
					System.out.println("\n[" + phoneNumber + "] - " + "This phone number is valid\n");
				}
				else
				{
					System.out.println("\n[" + phoneNumber + "] - " + "This phone number is invalid\n");
				}
				
				continue;
			}
			
			/* choice 2: exit program */
			
			else if(choice == 2)
			{
				System.exit(0);
			}
			
			/* choice = anything else - error, choose again */
			else
			{
				System.out.println("Invalid choice: [" + choice + "] - " + "Please choose either 1 or 2 ...\n\n\n");
				continue;
			}
		}
		
		scan.close();
	}
	
	
	
	
	public static void menu() {
		
		System.out.println("\n\n\tMenu\n\n"
				+ "What would you like to do?\n\n"
				+ "1. Check a number\n"
				+ "2. Exit\n");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
