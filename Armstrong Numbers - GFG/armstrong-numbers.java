// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}// } Driver Code Ends


class Solution {
    static String armstrongNumber(int n)
    {
        double res=0;
        int count=0;
        int temp=n;
        while(temp!=0)
        {
          count=count+1;
          temp=temp/10;
        }
        int num=n;
        int x=0;    
        while(num!=0)
        {
          x=num%10;
          res=res+Math.pow(x,count);
          num=num/10;
        }
        if(n==res)
        {
            return "Yes";
        }
        return "No";
       
    }
}