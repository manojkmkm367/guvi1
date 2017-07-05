import java.io.IOException;
import java.util.Scanner;

public class Main {
		public static void main(String[] args)throws IOException{
			Scanner in=new Scanner(System.in);
			System.out.println("ENTER THE START POINT");int start=in.nextInt();
	
			System.out.println("ENTER THE END POINT");int end=in.nextInt();
			
			int i,j,count=0,flag=0;
			for(i=start;i<=end;i++)
			{
				flag=0;
				for(j=2;j<start;j++)
				{
					if(i%j ==0)
						{flag=1;break;}
				}
				if(flag==0)
					count++;
			}
			
			System.out.println(count);
		}

}
