import java.util.*;
public class Character {
	
	
	    public static void main(String args[]){
	        char s;
	        Scanner sc=new Scanner(System.in);
	        s=sc.next().charAt(0);
	        if(s>=48 &&s<=57)
	            System.out.println("digit");
	        else if(s>='a'&& s<='z'||s>='A'&& s<='Z')
	            System.out.println("Alphabhet");
	        else
	            System.out.println("Special Character");
	    }
	    
	    
	}


