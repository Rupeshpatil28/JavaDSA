import java.util.*;
public class _9MxSubArSumPrefix_Sum {

    // Function to calculate maximum subarray sum using brute force
    public static void MaxSubArrSum(int arr[]) {
        int currSum = 0; 
        int maxSum = Integer.MIN_VALUE; 
        int prefix[] = new int[arr.length];   
        
        prefix[0] = arr[0];
        
        //Calculate Prefix Array, ha ek navin prefix arr bnvto
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        //Start
        for(int i=0; i<arr.length; i++) {
            int start = i; 
            //End
            for (int j=i; j<arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];            
               
              
                // System.out.println(currSum);               
                // Update maxSum if the new currSum is larger
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }  
        System.out.println("Maximum prefix sum : " + maxSum);        //Print
    }
    public static void main(String args[]) {
        int arr[] = {1, -2, 6, -1, 3};
        MaxSubArrSum(arr);
    }
}