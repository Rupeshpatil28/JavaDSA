
import java.util.Scanner;

public class sumofTwoNum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter N number : ");
        int n = sc.nextInt();

        int count = 1;
        int sum = 0;

        while(count <= n) {
            sum = sum + count;
            count = count + 1;
        }
        System.out.println(sum);

    }
    
}
