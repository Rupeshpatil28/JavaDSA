public class BinomialCoeff {

    public static int factorial(int n) {     //To find a factorial
        int f = 1;
        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }
    public static int BinoCoe(int n, int r) {     //taking 3 factorials
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int BinoCoe = fact_n / (fact_r * fact_nmr);      //formula to find it
        return BinoCoe;
    }

    public static void main(String args[]) {
        int n = 5;
        int r = 2;
        int Binomial = BinoCoe(n,r);
        System.out.println(Binomial);
    }
}
