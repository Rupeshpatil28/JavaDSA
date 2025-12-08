
//The Problem is that to find the 
//      Largest max number in the given array 

public class _3LargetNum {
    // public static int Largest(int arr[]) {
    //     int largest = Integer.MIN_VALUE;    //Infinity Min value
    //      for(int i=0; i<arr.length; i++) {
    //         if (largest < arr[i]) {  //jar max chya index peksha arr index motha asel tr
    //             largest = arr[i];     //parat tya arr index la max madhe takun max la update karaych
    //         }
    //     }
    //     return largest;
    // }

    // public static int Smallest(int arr[]) {
    //     int Small = Integer.MAX_VALUE;  //infinity maximum value
    //     for(int i=0; i<arr.length; i++) {
    //         if(Small>arr[i]) {
    //             Small = arr[i];
    //         }
    //     }
    //     return Small;
    // }

    public static void main(String args[]) {
        int arr[] = {2,6,3,5};
        
        //Largest
        int largest = arr[0];
         for(int i=0; i<arr.length; i++) {
            if (largest < arr[i]) {  //jar max chya index peksha arr index motha asel tr
                largest = arr[i];     //parat tya arr index la max madhe takun max la update karaych
            }
        }   
        System.out.println("Largest element Is: "+largest);

        //Smallest
        int Small = Integer.MAX_VALUE;  //infinity maximum value
        for(int i=0; i<arr.length; i++) {
            if(Small>arr[i]) {
                Small = arr[i];
            }
        }
        System.out.println("Smallest in the arr: "+ Small);
    }
}