import java.io.IOException;
import java.util.Scanner;

public class Main {
		public static void main(String[] args)throws IOException{
			System.out.println("ENTER THE STRING");
			Scanner in=new Scanner(System.in);
			String inp=in.nextLine();
			
			StringBuffer out=new StringBuffer();
			
			char[] ch=inp.toCharArray();
			int i;
			int n=ch.length;
			for(i=0;i<n;i++,i++)
			{
				if(i%2==0)
				{
					if((i+1)<n)
						out.append(ch[i+1]);
				}
				if(i!=n-1)
				out.append(ch[i]);
			}
			
			if(n%2==1)
				out.append(ch[n-1]);
			
			System.out.println(out);
		}

}
