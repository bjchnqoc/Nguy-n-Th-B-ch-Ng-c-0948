/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture5;

/**
 *
 * @author computer
 */
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
