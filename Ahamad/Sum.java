import java.util.*;
public class Sum {

	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int sum=0;
	        while(n>0){
	            int r=n%10;
	            sum+=r;
	            n/=10;
	            
	        }
	        System.out.println(sum);
	    }
	}


