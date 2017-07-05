import java.io.IOException;
import java.util.Scanner;

public class Main{
		public static void main(String[] args)throws IOException{
			System.out.println("ENTER THE STRING");
			Scanner in=new Scanner(System.in);
			String inp=in.nextLine();
			
			StringBuffer out=new StringBuffer();
			
			int n=inp.length();
			
			if(n>1)
			{
				for(String str: inp.split("_"))
				{
					String start=(str.substring(0,1)).toUpperCase();
					String end=(str.substring(1)).toLowerCase();
					out.append(start+end+" ");
				}
			}
			System.out.println(out);
		}

}
