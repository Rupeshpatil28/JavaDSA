
public class practice {
    public static void reversarr (int arr[]) {
        int start = 0; 
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start ++;
            end --;
        }
    }
    public static void main(String args[]) {
        int arr[] = {3,4,5,38,78,5};
        reversarr(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[3] + " ");
        }
        System.out.println( );
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
       
}
