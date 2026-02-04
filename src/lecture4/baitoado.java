/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture4;

/**
 *
 * @author computer
 */
import java.util.Scanner;

public class baitoado {

    public static int quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap x: ");
        double x = scanner.nextDouble();
        System.out.print("nhap y: ");
        double y = scanner.nextDouble();
        System.out.print("toa do: " + quadrant(x, y));
    }
}
