<<<<<<< HEAD
public class InvertedRotatedHalfPyrmd {
    public static void PrintPyramid (int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {    //print empty spaces n - i
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {     //print stars k to i
                System.out.print("*");
            }
            System.out.println(); //for new line
        }
    }
    public static void main(String args[]) {
        PrintPyramid(10);
    }
}
=======
public class InvertedRotatedHalfPyrmd {
    public static void PrintPyramid (int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {    //print empty spaces n - i
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {     //print stars k to i
                System.out.print("*");
            }
            System.out.println(); //for new line
        }
    }
    public static void main(String args[]) {
        PrintPyramid(10);
    }
}
>>>>>>> 2602d06755d11123f2a36cf586bb7d6e8a104877
