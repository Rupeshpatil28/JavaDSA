public class PrimeOrNot {

//    public static boolean isPrime(int n) {
//        for(int i = 2; i<=n-1; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    //In Optimised way
    public static boolean isPrime(int n) {;
        for (int i = 2; i<=Math.sqrt(n); i++) {   //optimised way Using math
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Print all primes in a range
    public static void PrimePrint(int n) {
        for (int i=2; i<=n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]) {
         PrimePrint(20);
    }
}
