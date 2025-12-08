
//  Syntax With Parameters

import java.util.*;
 
public class Parameters_02 {

    public static int calculator(int num1, int num2) {  // Parameters or Formal paramerts
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();

        int totalsum = calculator(a, b);  //Arguments or actual parameters
        System.out.println("The total sum is : "+ totalsum);
    }
}
