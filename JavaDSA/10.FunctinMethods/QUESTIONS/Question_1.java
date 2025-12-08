
//Question 1 : Write a Java method to compute the average of three numbers..

package QUESTIONS;

public class Question_1 {
    public static void average(int p, int q, int r) {
        int sum = p + q + r;
        int totalNo = 3;
        int average = sum / totalNo;
        System.out.println(average);
    }
    public static void main(String args[]) {
        average(4, 7, 3);
    }
}
