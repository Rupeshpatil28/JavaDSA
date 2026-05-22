
// Call by value

public class CallByValue_03 {

    public static void swap(int a, int b) {
        //Swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
    }

    public static void main (String args[]) {
        //swap - values exchange
        int a = 5;
        int b = 3;
        swap(a,b);

        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

    }
}
