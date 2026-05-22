
public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,4};
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];   //add current array element to sum,  sum me arr[i] ki value plus kardo
        }
        System.out.println(sum);
    }
}
