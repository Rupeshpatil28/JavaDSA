<<<<<<< HEAD
public class _2LinearSearch {

    public static int LinearSear(int arr[], int key) {
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == key) {
                return i;
            } 
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {2,3,6,8,10,12,14,16};
        int key = 10;

        int search = LinearSear(arr, key);
        if (search == -1)  {
            System.out.println("not found");
        } else {
            System.out.println("key on Index :" +search);
        }
        
    }
=======
public class _2LinearSearch {

    public static int LinearSear(int arr[], int key) {
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == key) {
                return i;
            } 
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {2,3,6,8,10,12,14,16};
        int key = 10;

        int search = LinearSear(arr, key);
        if (search == -1)  {
            System.out.println("not found");
        } else {
            System.out.println("key on Index :" +search);
        }
        
    }
>>>>>>> 2602d06755d11123f2a36cf586bb7d6e8a104877
}