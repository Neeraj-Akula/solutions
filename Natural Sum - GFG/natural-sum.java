// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.find(n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int find(int n)
    {
        int i=1;
        int j=2;
        int x=2*n;
        while(i>0)
        {
          if(i*j==x)
          {
            return i;  
          }
          else if(i*j>x)
          {
            return -1;  
          }
          i++;
          j++;
        }
       return 1; 
    }
}