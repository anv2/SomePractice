/**States the minimum number of coins to match the input with denominations 1, 5, and 10.

Input. 
An integer n.

Output. 
The minimum number of coins with denominations 1, 5, 10 that add up to m.

Sample 
Input:
43
Output:
7
7= 10 +10 +10 +10 +1 +1 +1

 * */

import java.util.Scanner;


public class Change {
    private static int getChange(int m) {
	    	int coin= 0;  	
	    	while(m != 0){
	    		if(m>=10){
	    	        m = m-10;
	    	        coin ++; 
	    		}
	    		else if(m>=5 && m<10){
	    			m= m-5;
	    			coin ++;
	    		}
	    		//more than 10 
	    		else if(m<5){
	    			m = m-1;
	    			coin ++;
	    		}    		
	    	}
	    return coin;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getChange(n));
    }
}