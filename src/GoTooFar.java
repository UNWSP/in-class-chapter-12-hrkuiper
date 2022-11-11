
public class GoTooFar {
		public static void main(String [] args) {
			
			// declaring array thingy
			int[] array = {33, 23, 23, 52, 23,};
			// trying my code
			try{
				
				for(int x = 0; x <= 6; ++x) {
					System.out.println(array[x]);
					
				}
				
			}
			catch(ArrayIndexOutOfBoundsException e){
				 
				System.out.println("now you've gone too far");
				
				
			}
		}

	}


