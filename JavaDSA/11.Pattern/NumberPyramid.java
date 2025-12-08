// // Output for n=5
//         1 
//        2 2
//       3 3 3
//      4 4 4 4
//     5 5 5 5 5
   

public class NumberPyramid {
    public static void Pyramid(int n) {
        //Outer Loop
        for(int i=1; i<=n; i++) {
            //Spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //Stars
            for(int j=1; j<=i; j++) {
                System.out.print(i + (" "));
            }
            System.out.println();
        }
    }

    public static void main (String args[]) {
        Pyramid(9);
    }
}


