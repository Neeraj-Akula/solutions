// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    int isPalindrome(String S)
    {
       int l=0;
       int r=S.length()-1;
       while(l<r)
       {
        if(S.charAt(l)!=S.charAt(r))
        {
          return 0;  
        }
        l++;
        r--;
        
       }
       return 1;
             
    }
    
}
