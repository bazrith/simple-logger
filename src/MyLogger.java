import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyLogger extends PrintStream {
	public MyLogger(PrintStream out) {
		super(out);		
	}

	String info = new SimpleDateFormat("EEE, MMMM d, y 'at' hh:mm:ss:S z").format(new Date());

	//boolean
	@Override	
	public void print(boolean b) {
		super.print(info + ": printing a boolean: " + b);
	}
	
	//char
	@Override
	public void print(char c) {
		super.print(info + ": printing a character: " + c);
	}
	
	//char array
	@Override
	public void print(char[] s) {
		super.print(info + ": printing an array of characters: " + new String(s));
	}
//	@Override
//	public void println(char[] s) {
//		super.println(info + ": printing an array of characters: " + new String(s));
//	}
	
	//double
	@Override
	public void print(double d) {
		super.print(info + ": printing a double: " + d);
	}
//	@Override
//	public void println(double d) {
//		super.println(info + ": printing a double: " + d);
//	}
	
	//float
	@Override
	public void print(float f) {
		super.print(info + ": printing a float: " + f);
	}
	
	//int
	@Override
	public void print(int i) {
		super.print(info + ": printing an integer: " + i);
	}
	
	//long
	@Override
	public void print(long l) {
		super.print(info + ": printing a long: " + l);
	}

	//Object
	@Override
	public void print(Object obj) {
		super.print(info + ": printing a String: " + obj);
	}
	
	//String
	@Override
	public void print(String s) {
		super.print(info + ": printing a String: " + s);
	}
}
