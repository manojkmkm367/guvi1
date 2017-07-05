import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
		public static void main(String[] args)throws IOException{
			Scanner in=new Scanner(System.in);
			System.out.println("ENTER THE N");int n=in.nextInt();
			System.out.println("ENTER THE K");int k=in.nextInt();
			int[] num=new int[n];int[] out=new int[n];
		    for(int i = 0;i<n;i++)
		    {
		   num[i]=in.nextInt();
		    }
		    int l=0;
		    for(int i = n-k;i<n;i++)
		    {
		out[l]=num[i];l++;
		    }
		    for(int i = 0;i<n-k;i++)
		    {
		out[l]=num[i];l++;
		    }
		
				System.out.println("rotated Array "+Arrays.toString(out));
			
			
		}

}
