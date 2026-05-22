public class CountingSort {
    public static void countingsort(int arr[]) {
        //first find a max
        int n = arr.length;
        int maxvalue = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            maxvalue = Math.max(maxvalue, arr[i]);
        }

        int count[] = new int[maxvalue+1];
        for(int i=0; i<n; i++) {
            count[arr[i]]++;
        }

        //Sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0) {
                arr[j] =  i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main (String args[]) {
        int arr[] = {2,100,5,3};
        countingsort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
