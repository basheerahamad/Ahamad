import java.util.*;
public class Prime {
	
	
	    
	    public static void main(String args[])
	    {
	        
	        int c=0;
	        for(int j=10;j<=99;j++)
	        {
	            c=0;
	        for(int i=2;i<=j/2;i++)
	        {
	            if(j%i==0)
	            c++;
	        }
	        if(c>0)
	            continue;
	        else
	            System.out.println(j+" prime");
	    }    
	    }


}
