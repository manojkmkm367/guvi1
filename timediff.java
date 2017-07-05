
import java.io.IOException;
import java.util.Scanner;

public class Main {
		public static void main(String[] args)throws IOException{
			Scanner in=new Scanner(System.in);
			System.out.println("ENTER THE FIRST TIME");String start=in.nextLine();
	
			System.out.println("ENTER THE SECOND TIME");String end=in.nextLine();
			
			String[] s=start.split(":");
			int s1=Integer.parseInt(s[0])*60  +Integer.parseInt(s[1]);
			
			String[] e=end.split(":");
			int e1=Integer.parseInt(e[0])*60  +Integer.parseInt(e[1]);
			
			int out=e1-s1;
			
			System.out.println("mins between two times :"+out+" mins");
		}

}
