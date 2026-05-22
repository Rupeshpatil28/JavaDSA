<<<<<<< HEAD
public class HollowRectangle {
    public static void Hollow(int rows , int columns) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=columns; j++) {
                if (i==1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Hollow(4, 5);     
    }
=======
public class HollowRectangle {
    public static void Hollow(int rows , int columns) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=columns; j++) {
                if (i==1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Hollow(4, 5);     
    }
>>>>>>> 2602d06755d11123f2a36cf586bb7d6e8a104877
}