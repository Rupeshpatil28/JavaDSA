public class _1Arrayy {

    public static void update(int array[]) {
        for(int i=0; i<array.length; i++) {
            array[i] = array[i] + 5;
        }
    }
    public static void main(String args[]) {
    int array[] = {2,35,43,7};

    update(array);
    for(int i=0; i<array.length; i++) {
        System.out.println(array[i]);
    }
    }
}
