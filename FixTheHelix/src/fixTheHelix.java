import java.util.Scanner;
public class fixTheHelix
	{

		public static void main(String[] args)
			{
			 Scanner userStringInput = new Scanner(System.in);
				System.out.println("Enter DNA Sequence:");
				String dna= userStringInput.nextLine();
				for(int i = 0; i < dna.length(); i++) {
				    
				if(dna.substring(i,i+1).equals("A")) {
					System.out.print("T");
				} else if(dna.equals("C")) {
					System.out.print("G");
				} 

			}

	}
}