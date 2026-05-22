<<<<<<< HEAD
public class _8MaxSubArraySum {
     // Function to calculate maximum subarray sum using brute force
    public static void maxsubarrsum(int arr[]) {
        // int currSum = 0;
        int maxSum = Integer.MIN_VALUE;    // stores the maximum sum found

        // Outer loop → selects start index of subarray
        for(int i=0; i<arr.length; i++) {
            int start = i;

            // Middle loop → selects end index of subarray
            for (int j=i; j<arr.length; j++) {
                int end = j;

                int currSum = 0;           // reset current sum for each (i, j) pair

                // Inner loop → adds elements from start(i) to end(j)
                for(int k=start; k<=end; k++) {
                    currSum += arr[k];     // add each element to currSum
                }
                System.out.println(currSum);
                
                // Update maxSum if the new currSum is larger
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }  
        System.out.println("Maximum of SubArr : " + maxSum);        //Print
    }
    public static void main(String args[]) {
        int arr[] = {2,4,6,8,10};
        maxsubarrsum(arr);
    }
}
=======
public class _8MaxSubArraySum {
     // Function to calculate maximum subarray sum using brute force
    public static void maxsubarrsum(int arr[]) {
        // int currSum = 0;
        int maxSum = Integer.MIN_VALUE;    // stores the maximum sum found

        // Outer loop → selects start index of subarray
        for(int i=0; i<arr.length; i++) {
            int start = i;

            // Middle loop → selects end index of subarray
            for (int j=i; j<arr.length; j++) {
                int end = j;

                int currSum = 0;           // reset current sum for each (i, j) pair

                // Inner loop → adds elements from start(i) to end(j)
                for(int k=start; k<=end; k++) {
                    currSum += arr[k];     // add each element to currSum
                }
                System.out.println(currSum);
                
                // Update maxSum if the new currSum is larger
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }  
        System.out.println("Maximum of SubArr : " + maxSum);        //Print
    }
    public static void main(String args[]) {
        int arr[] = {2,4,6,8,10};
        maxsubarrsum(arr);
    }
}
>>>>>>> 2602d06755d11123f2a36cf586bb7d6e8a104877
