import java.util.Arrays;

public class QuestionSorting {
    public static int[] Sortarr(int arr[]) {
        int n = arr.length;
        for(int pass=0; pass<n-1; pass++) {
            for(int j=0; j<n-1-pass; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        
    }
}
