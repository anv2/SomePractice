import java.util.*;

/**
 * Prints 1 if there is a majority element in an array, or 0 otherwise.

Sample
Input:
4
3 3 3 1 
Output:
1
3 is the majority element.

@author Vithia An
@version 1.0
 * */
public class GetMajority {
    private static int getMajority(int[] a, int l, int r) {
        
    		if (l == r) {
            return -1; 	//no majority
        }
    		
        if (l + 1 == r) {
            return a[l];
        }

        int mid = l+(r-l)/2;
        
        if(a.length ==0){
        		return -1; 	//no majority
        }
        if(a.length == 1){
        		return a[0];
        }
        
        int eL = getMajority(a, l, mid);
        
        int eH = getMajority(a, mid+1, r);
        
        int countL = countFrequency(eL, a);
        int countH = countFrequency(eH, a);
        
        if(countL > a.length/2){
        		return eL;
        }
        if(countH > a.length/2){
        		return eH;
        }
        
        return -1;	//no majority
    }

    private static int countFrequency(int v, int[] a){
    		int count =0;
    		for(int element: a){
    			if (element == v){
    				count++;
    			}
    		}
    		return count;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (getMajority(a, 0, a.length) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

