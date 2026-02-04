package lecture6.arrays;

import java.util.Arrays;

public class arrarysandforloops {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        //gan gia tricho mang
        for (int i = 0; i < 10; i++) {
            numbers[i] = 2 * i;
        }
        //cach 1:
        System.out.println("numbers [] = " + Arrays.toString(numbers));
        //cach 2:
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
    }
}
