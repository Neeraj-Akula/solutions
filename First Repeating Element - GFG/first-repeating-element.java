// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total count of elements
            int n = sc.nextInt();

            // creating a new array of size n
            int arr[] = new int[n];

            // inserting elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            // calling firstRepeated method
            // and printing the result
            System.out.println(ob.firstRepeated(arr, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution 
{
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) 
    {
       int min=Integer.MAX_VALUE;
       HashMap<Integer,Integer>kia=new HashMap<>();
       for(int i=0;i<n;i++)
       {
         if(kia.containsKey(arr[i]))
         {
            if(kia.get(arr[i])<min)
            {
             min=kia.get(arr[i]);   
            }
         }
         else
         {
           kia.put(arr[i],i+1);  
         }
       }
       
       if(min<n+1)
       {
         return min;  
       }
    return -1;
    }
}    
