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
