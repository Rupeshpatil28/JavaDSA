<<<<<<< HEAD
public class practice {
    public static void choco(int arr[]) {
        int n = arr.length;
        int count = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count ++;
            }
        }
        while(count < n) {
            arr[count] = 0;
            count++;
        }
    }
    public static void main(String args[]) {
    int arr[] = {4,5,0,1,9,0,5,0};
        choco(arr);
        for (int i=0; i<arr.length; i++) {
        System.out.print(arr[i]);
        }
    }
}




















=======

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
>>>>>>> 2602d06755d11123f2a36cf586bb7d6e8a104877
