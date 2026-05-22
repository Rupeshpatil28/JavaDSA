
//a 2D array is an array of arrays meaning it consist
//       of rows and columns forming a table-like structure

public class Arrays2D {
    public static boolean search(int arrmatrix[][], int key) {
        for(int i=0; i<arrmatrix.length; i++) {
            for(int j=0; j<arrmatrix[i].length; j++) {
                if (arrmatrix[i][j] == key) {
                    System.out.println("yes its match (" + i +","+ j + ")" );
                    return true;
                }
            }
        }
        return false;
    }

    public static void printarr(int arrmatrix[][]) {
        // Print the matrix
        for (int i = 0; i < arrmatrix.length; i++) {
            for (int j = 0; j < arrmatrix[i].length; j++) {
                System.out.print(arrmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int[][] arrmatrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
       printarr(arrmatrix);
       search(arrmatrix, 5);
        
    }
}
 