<<<<<<< HEAD
public class DecToBin {
    public static void decTobin (int n) {
        int mynum = n;
        int power = 0;
        int bin = 0;
        while (n > 0) {
            int reminder = n % 2;
            bin = bin + (reminder * (int)Math.pow(10, power));

            power ++;
            n = n / 2;

        }
        System.out.println("Binary of " + mynum + " = " + bin);

    }
    public static void main(String args[]) {
        decTobin(7);
    }
}
=======
public class DecToBin {
    public static void decTobin (int n) {
        int mynum = n;
        int power = 0;
        int bin = 0;
        while (n > 0) {
            int reminder = n % 2;
            bin = bin + (reminder * (int)Math.pow(10, power));

            power ++;
            n = n / 2;

        }
        System.out.println("Binary of " + mynum + " = " + bin);

    }
    public static void main(String args[]) {
        decTobin(7);
    }
}
>>>>>>> 2602d06755d11123f2a36cf586bb7d6e8a104877
