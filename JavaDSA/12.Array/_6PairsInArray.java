public class _6PairsInArray {

public static void pairinarray(int arr[])  {
    int totalpair = 0;
    for(int i=0; i<arr.length; i++) {
        int counter = arr[i]; //2,4,6,8,10
        for(int j=i+1; j<arr.length; j++) {
            System.out.print("(" + counter + "," + arr[j] + ")" );
            totalpair++;
        }
        System.out.println();
    }
    System.out.println("Total Pairs are the : " + totalpair);
}
    public static void main(String args[]) {
        int arr[] = {2,4,6,8,10};
        pairinarray(arr);
    }
}