
public class MyLoggerTest {
	public static void main(String[] args) {
		// Initialize MyLogger class
		MyLogger testLogger = new MyLogger(System.out);
		
		// Use System.setOut method to set your output stream
		System.setOut(testLogger);
		
		//integer test
		int i = 15;
		System.out.println(i);
		
		//boolean test
		System.out.println(true);
		
		//char test
		System.out.println('c');
		
		//char array test
		char[] ctest = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println(ctest);
		
		//double test
		double d = 34.5;
		System.out.println(d);
		
		//float test
		float f = 45.4f;
		System.out.println(f);
		
		//long test
		long l = 12345678;
		System.out.println(l);
		
		//Object test
		System.out.println(testLogger);
		
		//String test
		String s = "My name is Sahnon";
		System.out.println(s);
	}
}