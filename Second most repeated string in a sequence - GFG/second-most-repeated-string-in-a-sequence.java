// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        HashMap<String, Integer> map = new HashMap<>();
            String ans="";
            for (int i=0 ; i < N ; i++)
            {
                map.put(arr[i], map.getOrDefault(arr[i],0)+1 );
            }
            ArrayList<Integer> kia = new ArrayList<>(map.values());
            Collections.sort(kia);
            int value = kia.get(kia.size() -2);
            for (Map.Entry<String, Integer> entry : map.entrySet())
            {
                if ((int)entry.getValue() == value)
                {
                   ans = entry.getKey();
                }
            }
            return ans;
    }
}