package lecture5;

import java.util.Scanner;

public class ptrinhbac2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = scanner.nextInt();
        while (a == 0) {
            System.out.print("nhap lai he so a,vi a=0 la PT bac nhat: ");
            a = scanner.nextInt();
        }
        System.out.print("nhap b: ");
        int b = scanner.nextInt();
        System.out.print("nhap c: ");
        int c = scanner.nextInt();
        double delta = b * b + 4 * a * c;
        if (delta < 0) {
            System.out.print("PT vo nghiem");
        } else if (delta == 0) {
            double x = -b / 2 * a;
            System.out.print("PT co nghiem kep: " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / 2 * a;
            double x2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.print("PT co 2 nghiem phan biet: " + x1 + " , " + x2);
        }

    }

}
