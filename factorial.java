
import java.io.IOException;
import java.util.Scanner;

public class Main {
		public static void main(String[] args)throws IOException{
			System.out.println("ENTER THE NUMBER");
			Scanner in=new Scanner(System.in);
			int a=in.nextInt();
			int i,x=1;
			for(i=1;i<=a;i++)
			{
				x=x*i;
			}
			
			System.out.println(x);
		}

}
