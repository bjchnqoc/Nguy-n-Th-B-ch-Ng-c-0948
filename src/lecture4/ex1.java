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

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What percentage did u earn?: ");
        int percent = scanner.nextInt();
        if (percent >= 90 && percent <= 100) {
            System.out.println("you got an A");
        } else if (percent >= 80) {
            System.out.println("you got an B");
        } else if (percent >= 70) {
            System.out.println("you got an C");
        } else {
            System.out.println("you got an D ");

        }

    }
}
