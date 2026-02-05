/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_ConditionalExecution;

/**
 *
 * @author computer
 */
import java.util.Scanner;

public class slide14lec4 { //so sánh hai số 

    public static int findMaxNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = scanner.nextInt();
        System.out.print("nhap b: ");
        int b = scanner.nextInt();
        if (a == b) {
            System.out.print("nhap so a!=b");
        } else {
            System.out.print("so lon hon: " + findMaxNumber(a, b));
        }
    }
}
