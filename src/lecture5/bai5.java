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

public class bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n 1-10: ");
        int n = scanner.nextInt();
        Random rand = new Random();
        int randomnumber;
        int sodem = 0;
        do {
            randomnumber = rand.nextInt(10) + 1;
            sodem++;
            System.out.println("lan " + sodem + " : " + randomnumber);
        } while (randomnumber != n);
        System.out.println(" so lan do " + sodem);
    }
}

// nhap so nguyen ngau nhien tu 1-10 den khi giong voi so nguyen ngau nhien 1-10 va dem so lan do

