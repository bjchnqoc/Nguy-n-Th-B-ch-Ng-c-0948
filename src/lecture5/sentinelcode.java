/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture5;

/**
 *
 * @author computer
 */
import java.util.Scanner;

public class sentinelcode {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("nhap so khac 0 : ");
        int number = console.nextInt();
        while (number != 0) {
            sum = sum + number;
            System.out.print("nhap so khac 0: ");
            number = console.nextInt();
        }
        System.out.println("the total is " + sum);

    }

}
