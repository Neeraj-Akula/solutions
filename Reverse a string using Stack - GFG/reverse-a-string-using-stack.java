// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}
// } Driver Code Ends


class Solution {
    
    public String reverse(String S)
    {
       Stack<Character> ans=new Stack<>(); 
       for(int i=0;i<S.length();i++)
       {
         ans.push(S.charAt(i)); 
       }
       String s2="";
       int j=0;
       while(j<S.length())
       {
         s2=s2+ans.pop();
         j++;
       }
       return s2;
    }

}