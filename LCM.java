/**
 * Program to find least common multiple of two integers a and b. 

Sample.
Input:
23565756 4576869
Output:
35952459365988

@author Vithia An
 * */

import java.util.*;

public class LCM {
	
	private static int gcd(int a, int b) {
		  
	    if(b==0){
	    		return a;
	    }
	    while(a !=0){
		    a = a%b;		//a is the remainder when a is divided by b
		    return gcd(b,a);    
	    }
	 return gcd(a,b);  
  }
	
  private static long lcm(int a, int b) {

    return (long) a/(gcd(a,b))*b ;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm(a, b));
    
 
  }
}