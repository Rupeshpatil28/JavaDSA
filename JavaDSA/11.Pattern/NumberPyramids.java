//Output
//              1 
//           2  1  2
//        3  2  1  2  3
//     4  3  2  1  2  3  4 
//  5  4  3  2  1  2  3  4  5

public class NumberPyramids {
    public static void NumPyramid (int n) {
        for(int i=1; i<=n; i++) {  //Outer 
            for(int j=1; j<=n-i; j++) {      //Spaces
                System.out.print(" ");
            }
            for(int j=i; j>=1;j--) {          //Descending
                System.out.print(j);
            } 
            for(int j=2; j<=i; j++) {           //Ascending
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        NumPyramid(15);
    }
}
