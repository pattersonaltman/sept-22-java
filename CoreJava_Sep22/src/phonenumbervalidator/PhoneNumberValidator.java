package phonenumbervalidator;

public class PhoneNumberValidator {

	
	
	
	
	/* 
	 * Method:  
	 *  
	 * - Description:  
	 *  
	 * - Notes: 
	 *  
	 * - Constraints: 
	 * 		- Does not check all invalid properties a phone # can may have at the same time (i.e 
	 * 			certain property-checks will have to pass first to ensure some of the other property-checks).
	 * 		- Does not check for amount of:  whitespaces, (, ), or -   (i.e. can have multiple spam
	 * 			of each and can still be valid).
	 * 
	 * - Requirements:
	 * 		- Assume a valid telephone number is 10 digits long and does not contain
				911 in any part.
			- Ensure to check for inputs with correctly formatted parenthesis & dashes.
			- Valid: 0123456789, (012) 345-6789, 012-345-6789
			- Invalid: 000911000, (111) 911-2084
	 */ 

	public static boolean validatePhoneNumber(String num) {
		
		int numDigits = 0;		//digit count
		
		for(int i = 0; i < num.length(); i++)
		{
			/* check if is a digit, 0-9 */
			
			if(num.charAt(i) == '0' || num.charAt(i) == '1' || num.charAt(i) == '2' 
					|| num.charAt(i) == '3' || num.charAt(i) == '4' || num.charAt(i) == '5'
					 || num.charAt(i) == '6' || num.charAt(i) == '7' || num.charAt(i) == '8'
					 || num.charAt(i) == '9')
			{
				numDigits++;
			}
			
			
			/* else, check there are no other symbols besides (, ), -, and whitespace (' ') */
			
			else if(num.charAt(i) != '(' && num.charAt(i) != ')' && num.charAt(i) != '-' 
					&& num.charAt(i) != ' ')
			{
				System.out.println("\nError: Valid phone numbers can only contains characters of: "
						+ "0-9, (, ), and -\n");
				return false;
			}
			
		}
		
		/* check if number of digits is 10, return false if not */
		
		if(numDigits != 10)
		{
			System.out.println("\nError: Valid phone numbers must contain exactly 10 digits\n");
			return false;
		}
		
		
		/* check if 911 exists */
		
		for(int i = 0; i < num.length(); i++)		// Triple-nested if(), with index-checking for 2nd and 3rd if()'s
		{
			if(num.charAt(i) == '9')
			{
				if((i+1) < num.length() && num.charAt((i+1)) == '1')
				{
					if((i+2) < num.length() && num.charAt((i+2)) == '1')
					{
						System.out.println("\nError: Valid phone numbers cannot contain \"911\" inside them\n");
						return false;
					}
				}
			}
		}
		
		/* Otherwise, phone number is valid */
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
