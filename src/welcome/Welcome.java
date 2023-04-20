package welcome;

public class Welcome {

	public static String welcome(String input) {
		if(input==null)
			return "Hello, my friend";
		if(input.trim().isEmpty())
			return "Hello, my friend";
		return "Hello, " + input.substring(0,1).toUpperCase() + input.substring(1);
	}
}
