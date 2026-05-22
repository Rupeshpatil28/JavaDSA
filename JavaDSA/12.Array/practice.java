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




















