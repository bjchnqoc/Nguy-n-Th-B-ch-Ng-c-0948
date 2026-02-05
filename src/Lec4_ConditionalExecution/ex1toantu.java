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

public class ex1toantu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What percentage did u earn?: ");
        int percent = scanner.nextInt();
        if (percent >= 90 && percent <= 100) {
            System.out.println("you got an A");
        }
        if (percent >= 80 && percent < 70) {
            System.out.println("you got an B");
        }
        if (percent >= 70 && percent < 60) {
            System.out.println("you got an C");
        }
        if (percent >= 60 && percent < 50) {
            System.out.println("you got an D ");

        }

    }
}
