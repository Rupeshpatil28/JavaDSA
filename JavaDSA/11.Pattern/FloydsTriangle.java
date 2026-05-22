public class FloydsTriangle {
    public static void FloydsPattern(int range) {
        int counter = 1;
        //Outer
        for(int i=1; i<range; i++) {
            //Inner
            for(int j=1; j<=i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        FloydsPattern(6);
    }
}
