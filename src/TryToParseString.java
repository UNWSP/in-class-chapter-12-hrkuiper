
public class TryToParseString {
	public static void main(String[] args) {
		String hayden = "hayden";
		
		try {
			int thing = Integer.parseInt(hayden);
			
			System.out.println(thing);
			
		}
		catch(NumberFormatException e) {
			System.out.println(" Error, please enter an integer");
		}
		
	}

}
