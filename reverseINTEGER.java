import java.io.IOException;
import java.util.Scanner;

public class Main{
		public static void main(String[] args)throws IOException{
			System.out.println("ENTER THE NUMBER");
			Scanner in=new Scanner(System.in);
			StringBuffer a=new StringBuffer(in.nextLine());
			a.reverse();
			System.out.println(a);
		}

}
