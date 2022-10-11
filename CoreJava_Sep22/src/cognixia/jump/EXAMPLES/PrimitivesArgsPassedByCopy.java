package cognixia.jump.EXAMPLES;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PrimitivesArgsPassedByCopy {
	

	int x = 10;
	int y = 60;


	
	public static void main(String[] args) {




		PrimitivesArgsPassedByCopy obj = new PrimitivesArgsPassedByCopy();
		
		System.out.println("Before:");
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		swap(obj.x, obj.y);
		
		System.out.println("\nAfter:");
		System.out.println(obj.x);
		System.out.println(obj.y);
		
			
	}
	
	
	
	
	public static void swap(int a, int b) {
		
		int c = a;
		a = b;
		b = c;
		
	}
	
	
	
	
	
	
	
	
	
	
}
