
import java.io.IOException;
import java.util.Scanner;

public class Main {
		public static void main(String[] args)throws IOException{
			Scanner in=new Scanner(System.in);
			System.out.println("ENTER THE DAY");String day=in.nextLine();
	
			if(day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday")|| day.equalsIgnoreCase("wednesday")||day.equalsIgnoreCase("thursday")||day.equalsIgnoreCase("friday"))
			System.out.println(true);
		
			else
				System.out.println(false);
			
			
		}

}
