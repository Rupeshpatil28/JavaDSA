//Insertion sort builds the sorted array one element 
//           at a time by. Inserting each new element into its correct 
//           position in the already sorted part.


public class insertionSort {
    public static void insertionSort(int arr[]) {
        // Traverse through the array starting from the second element
        for(int i=1; i<arr.length; i++) { 
            // The element to be positioned at the correct place
            int key = arr[i];
            // The index of the previous element
            int prev = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while(prev >= 0 && arr[prev] > key) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Place the key at its correct position in the sorted part
            arr[prev + 1] = key;
        }
    }

    public static void main(String args[]) {
        // Example array to be sorted
        int arr[] = {3,5,4,1,2};

        // Sort the array
        insertionSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
