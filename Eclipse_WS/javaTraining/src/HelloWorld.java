import java.util.Date;

public class HelloWorld 
{ 
	/*
	 * 1. VARIABLES
	 * 2. METHODS
	 * 3. CONSTRUCTORS
	 * 4. STATIC INITALIZATION BLOCK
	 * 5. INSTANCE IB
	 */

	public static void main(String[] args) 
	{
		System.out.println("Hello All, Welcome to Java Programming");
		Date d = new Date();
		System.out.println(d.toString().replaceAll(" ", "_").replaceAll(":", "_"));
	}
}
