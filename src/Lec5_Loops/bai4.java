package Lec5_Loops;
import java.util.*;
import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        Random rand = new Random();
        double randomnumber = rand.nextDouble() * (100.0 - 1.0) + 1.0;
//        System.out.print("random " + randomnumber);
        if (n < randomnumber) {
            System.out.print(n +" < " + randomnumber);
        } else if (n >  randomnumber) {
            System.out.print(n + ">" +  randomnumber);
        } else if (n == randomnumber) {
            System.out.print(n + "=" +  randomnumber);
        }
    }
}
//nhap vao 1 so 1-100 kiem tra so do co lon hon/be hon/bang so thuc tu1.0-100.0
