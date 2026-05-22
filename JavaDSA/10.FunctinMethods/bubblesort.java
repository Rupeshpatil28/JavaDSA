public class bubblesort {

    public static void sortingbubble(int arr[]) {
        for(int pass=0; pass<arr.length-1; pass++) {
            for(int j=0; j<arr.length-1-pass; j++) {     // < controls j // -1 protects j+1         
                if (arr[j] > arr[j+1]) {                 
                    //Swap                   
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printarr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5,3,8,4,6};
        sortingbubble(arr);
        printarr(arr);
    }
}