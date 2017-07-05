
import java.io.IOException;
import java.util.Scanner;

public class Main {
		public static void main(String[] args)throws IOException{
			Scanner in=new Scanner(System.in);
			System.out.println("ENTER THE STRING");
			StringBuffer a=new StringBuffer(in.nextLine());
			a.reverse();
			int n=a.length();
			int i;
			for(i=0;i<n-1;i++)
			{	System.out.println(i+"for "+a);
				if((a.substring(i,i+1).equalsIgnoreCase("a"))||(a.substring(i,i+1) .equalsIgnoreCase("e"))||(a.substring(i,i+1) .equalsIgnoreCase("i"))||(a.substring(i,i+1)   .equalsIgnoreCase("o"))||(a.substring(i,i+1)   .equalsIgnoreCase("u")))
						{a=a.replace(i, i+1, "");n=a.length();}
			}
			
		
				System.out.println("Reverse string Without vowels"+a);
			
			
		}

}
