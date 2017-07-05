import java.io.IOException;
import java.util.Scanner;

public class Main{
		public static void main(String[] args)throws IOException{
			System.out.println("ENTER THE STRING");
			Scanner in=new Scanner(System.in);
			String a=in.nextLine();
			int out=Integer.parseInt(a);
			System.out.println(out);
			//System.out.println(a+100);
			//System.out.println(out+100);
		}

}
