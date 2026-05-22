public class BinToDecimal {

    public static void bintodec (int BinNum) {
        int power = 0;
        int decNum = 0;
        while (BinNum > 0) {
            int lastdigit = BinNum % 10;   //lastdigit of vlue, reminder
            decNum = decNum + (lastdigit * (int)Math.pow(2, power));

            power ++;
            BinNum = BinNum / 10;     //reminder nikalke bachi value
        }
        System.out.println("Decimal of " +  BinNum  + " = "  + decNum);
    }

    public static void main(String args[]) {
        bintodec(1000010);
    }
}
