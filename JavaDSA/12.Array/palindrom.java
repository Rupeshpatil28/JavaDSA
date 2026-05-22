<<<<<<< HEAD

import java.util.Scanner;

public class palindrom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 65 && c[i] <= 90) {
                c[i] = (char) (c[i] + 32);
            }
        }
        System.out.println(c);

    }
}

=======

import java.util.Scanner;

public class palindrom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 65 && c[i] <= 90) {
                c[i] = (char) (c[i] + 32);
            }
        }
        System.out.println(c);

    }
}

>>>>>>> 2602d06755d11123f2a36cf586bb7d6e8a104877
