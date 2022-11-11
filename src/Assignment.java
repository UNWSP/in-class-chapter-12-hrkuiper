
public class Assignment {
	public static void main(String[] args) {
		String num = "Hayden";
		int[] array = {32,23,56,23,23};
		
		try
		{
			for(int x = 0; x < 7; ++x) {
				System.out.println(array[x]);
			}
			
			int thing = Integer.parseInt(num);
			System.out.println(thing);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Illegal access of array");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please enter an integer");
		}
		finally
		{
			System.out.println("no exceptions!");
		}
	}

}
