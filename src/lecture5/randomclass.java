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
public class randomclass {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = 0;// so lan gieo xx
        int sum = 0;
        while (sum != 7) {
            int roll1 = rand.nextInt(6) + 1; //6:0-5;+1:1-6
            int roll2 = rand.nextInt(6) + 1;
            sum = roll1 + roll2;
            System.out.println(roll1 + " + " + roll2 + " = " + sum);
            n++;
        }
        System.out.println("you won after " + n + " tries!");
    }
}
