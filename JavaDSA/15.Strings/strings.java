

// STRINGS -
//       words, sentences, paragraphs
//       Strings are IMMUTABLE

import java.util.*;

public class strings {

    public static void printer(String name) {
        for(int i=0; i<name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        // char arr[] = {'d', 'd', 'f'};
        // String str = "abcd";
        // String str2 = new String("xys");
        // System.out.println(arr);

        // System.out.print("Enter Here : ");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // String brand = "@gmail.com";
        // String regenerate = name + brand;
        // System.out.println(regenerate);



        String name = "Rupesh";
        printer(name);
        System.out.println(name.length());
    }
}
