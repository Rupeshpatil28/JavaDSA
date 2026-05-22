public class _10MaSubArSumKadanes {
    public static void kadanes(int arr[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            currsum = currsum + arr[i];
            if(currsum < 0) {
                currsum = 0;
            }

            if (currsum > maxSum) {
                maxSum = currsum;
            }
            
        }
        System.out.println(maxSum);
    }
    public static void main(String args[]) {
        int arr[] = {1,-2,3,4};
        kadanes(arr);
    }
}


