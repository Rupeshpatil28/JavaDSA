// package DSA.Array;
// public class Twosum {

//     public static void main(String[] args) {
        
//         int[] n = { 2, 7, 11, 15};
//         for (int i = 0; i < n.length; i++) {
//             for (int j = i + 1; j <= n.length-1; j++) {
//                 if (n[i] + n[j] == 9) {
//                     System.out.println(i);
//                     System.out.println(j);
//                 }
//             }
//         }

//     }
// }




















public class Twosum {

    public static void main(String[] args) {
        int[] arr = {2,7,5,3,1};
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == 9) {
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}