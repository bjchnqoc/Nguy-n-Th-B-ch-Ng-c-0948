package lecture5;
import java.util.*;
//import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomnumber = rand.nextInt(80 - 3 + 1) + 3;
        System.out.println("random: " + randomnumber);
        if (randomnumber % 2 == 0) {
            System.out.println("chan");
        } else {
            System.out.println("le");
        }
    }
}
