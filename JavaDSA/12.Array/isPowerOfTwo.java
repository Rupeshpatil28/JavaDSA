<<<<<<< HEAD
// Given an integer n, return true if it is a
// power of two, otherwise return false.

// An integer n is a power of Two

// EX.  INPUT: n = 3
//      OUTPUT: false

// EX.  INPUT: n = 16
//      OUTPUT: true




import java.util.Scanner;

public class isPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i < n) {
            i = i * 2;
        }

        // System.out.println(i == n);    <== hya step made direct true false return hoto 
                                            //  nahitr khalchi step pn use karu shakto

        if (i == n) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
=======
// Given an integer n, return true if it is a
// power of two, otherwise return false.

// An integer n is a power of Two

// EX.  INPUT: n = 3
//      OUTPUT: false

// EX.  INPUT: n = 16
//      OUTPUT: true




import java.util.Scanner;

public class isPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i < n) {
            i = i * 2;
        }

        // System.out.println(i == n);    <== hya step made direct true false return hoto 
                                            //  nahitr khalchi step pn use karu shakto

        if (i == n) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
>>>>>>> 2602d06755d11123f2a36cf586bb7d6e8a104877
