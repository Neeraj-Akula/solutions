// { Driver Code Starts
// Initial Template for Java
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
            System.out.println(ob.oddEven(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static String oddEven(String S)
    {
      int []ch=new int[27];
      for(int i=0;i<S.length();i++)
      {
        ch[S.charAt(i)-'`']++;
      }
      int x=0;
      int y=0;
      for(int i=1;i<27;i++)
      {
        if(i%2==0&&ch[i]%2==0&&ch[i]!=0)
        {
          x=x+1;  
        }
        else if(i%2!=0&&ch[i]%2!=0&&ch[i]!=0)
        {
          y=y+1;  
        }
      }
      if((x+y)%2==0)
      {
        return "EVEN"; 
      }
      return "ODD";
      
    }
}