<<<<<<< HEAD
public class _01_Triangle {
    public static void Triangle(int range) {
        for(int i=1; i<=range; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1");                   
                } else {
                        System.out.print("0");         
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Triangle(5);
    }
}
=======
public class _01_Triangle {
    public static void Triangle(int range) {
        for(int i=1; i<=range; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1");                   
                } else {
                        System.out.print("0");         
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Triangle(5);
    }
}
>>>>>>> 2602d06755d11123f2a36cf586bb7d6e8a104877
