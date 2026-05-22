<<<<<<< HEAD
//Binary Search - binary search is a searching algorithm that works on sorted arrays by repeatedly 
//                dividing the search internal into half


public class _4BinarySearch {

    public static int binarysearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
 
            //Comparison
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {  //Right
                start = mid + 1;
            } else {   //left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("index for key is : " + binarysearch(numbers, key));
    }
}
=======
//Binary Search - binary search is a searching algorithm that works on sorted arrays by repeatedly 
//                dividing the search internal into half


public class _4BinarySearch {

    public static int binarysearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
 
            //Comparison
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {  //Right
                start = mid + 1;
            } else {   //left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("index for key is : " + binarysearch(numbers, key));
    }
}
>>>>>>> 2602d06755d11123f2a36cf586bb7d6e8a104877
