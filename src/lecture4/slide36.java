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

public class slide36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = scanner.nextInt();
        System.out.print("nhap b: ");
        int b = scanner.nextInt();
        System.out.print("nhap (+,-,*,/): ");
        char caculator = scanner.next().charAt(0);

        switch (caculator) {
            case '+':
                System.out.println("a + b: " + (a + b));
                break;
            case '-':
                System.out.println("a - b: " + (a - b));
                break;
            case '*':
                System.out.println("a * b: " + (a * b));
                break;
            case '/':
                System.out.println("a / b: " + (a / b));
                break;
            default:
                System.out.println("no solution");
        }

    }
}
