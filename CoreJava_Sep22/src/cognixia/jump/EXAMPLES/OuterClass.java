package cognixia.jump.EXAMPLES;

public class OuterClass {

	public void method1() {
		
		class LocalInner {
			
		}
		
		LocalInner local1 = new LocalInner();	//instantiated inside local method
		
	}
	
	public void method2() {
		
//		LocalInner local2 = new LocalInner();	//cannot be instantiated outside
												//method it is defined in
	}
	
}
