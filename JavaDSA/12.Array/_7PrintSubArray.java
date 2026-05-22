<<<<<<< HEAD
public class _7PrintSubArray {
    public static void subarrays(int arr[]) {
        int totalsubArr = 0;

        for(int i=0; i<arr.length; i++) {  //Start pointer 0 to arr length
            int start = i;

            for(int j=i; j<arr.length; j++) {    //end pointer 0 to arr length
                int end = j;
                
                for(int k=start; k<=end; k++) { //start to end
                    int subarr = arr[k];
                    System.out.print(subarr + " ");
                    totalsubArr ++;
                }
                System.out.println();
            }
            System.out.println();        
        }
        System.out.println("Total subArr : " + totalsubArr);
    }
    public static void main(String args[]) {
        int arr[] = {2,4,6,8,10};
        subarrays(arr);
    }
=======
public class _7PrintSubArray {
    public static void subarrays(int arr[]) {
        int totalsubArr = 0;

        for(int i=0; i<arr.length; i++) {  //Start pointer 0 to arr length
            int start = i;

            for(int j=i; j<arr.length; j++) {    //end pointer 0 to arr length
                int end = j;
                
                for(int k=start; k<=end; k++) { //start to end
                    int subarr = arr[k];
                    System.out.print(subarr + " ");
                    totalsubArr ++;
                }
                System.out.println();
            }
            System.out.println();        
        }
        System.out.println("Total subArr : " + totalsubArr);
    }
    public static void main(String args[]) {
        int arr[] = {2,4,6,8,10};
        subarrays(arr);
    }
>>>>>>> 2602d06755d11123f2a36cf586bb7d6e8a104877
}