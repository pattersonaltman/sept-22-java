package cognixia.jump.EXAMPLES;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ObjectsCopiedByReference {
	
	int x = 10;	
		
	public static void main(String[] args) {

		ObjectsCopiedByReference t1 = new ObjectsCopiedByReference();
		ObjectsCopiedByReference t2 = t1;
		
		System.out.println("t1.x: " + t1.x);
		System.out.println("t2.x: " + t2.x);
		
		t1.x = 5000;
		
		System.out.println("t1.x: " + t1.x);
		System.out.println("t2.x: " + t2.x);		
			
	}
	
}
