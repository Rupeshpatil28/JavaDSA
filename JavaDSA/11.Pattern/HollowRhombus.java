<<<<<<< HEAD
public class HollowRhombus {
    public static void Hollow(int n ) {
        
        for(int i=1; i<=n; i++) {         //Outer Loop

            for(int j=1; j<=n-i; j++) {   //Spaces
                System.out.print(" ");
            }

            for(int j=1; j<=n; j++) {   //Stars printing
                if (i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Hollow(7);
    }
}
=======
public class HollowRhombus {
    public static void Hollow(int n ) {
        
        for(int i=1; i<=n; i++) {         //Outer Loop

            for(int j=1; j<=n-i; j++) {   //Spaces
                System.out.print(" ");
            }

            for(int j=1; j<=n; j++) {   //Stars printing
                if (i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Hollow(7);
    }
}
>>>>>>> 2602d06755d11123f2a36cf586bb7d6e8a104877
