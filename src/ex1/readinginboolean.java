/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author computer
 */
import java.util.Scanner;

public class readinginboolean {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a boolean: ");
        boolean b = keyboard.nextBoolean();
        System.out.println(b);
    }
}
