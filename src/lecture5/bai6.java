package lecture5;

import java.util.*;
import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomnumber = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        while (n < 1 || n > 100) {
            System.out.print("nhap lai: ");
            n = scanner.nextInt();
        }
        if (n >= 1 && n <= 100) {
            while (n != randomnumber) {
                if (n < randomnumber) {
                    System.out.println("lon hon");
                    n = scanner.nextInt();
                } else if (n > randomnumber) {
                    System.out.println("be hon");
                    n = scanner.nextInt();
                }
            }
            if (n == randomnumber) {
                System.out.print("chuc mung");
            }
        }
    }
}
//sinh mot so ngau nhien tu 1-100. Nguoi choi nhap so doan. Neu doan dung in ra"chuc mung". Neu sai goi y"lon hon" hoac"be hon".Lap lai cho den khi doan dung
