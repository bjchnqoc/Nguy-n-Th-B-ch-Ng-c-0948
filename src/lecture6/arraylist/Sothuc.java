package lecture6.arraylist;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Sothuc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> Sothuc = new ArrayList<>();

        for (double i = 0; i < 7; i++) {
            System.out.println("nhap so thuc: ");
            Sothuc.add(scanner.nextDouble());

        }
        for (int i = 0; i < Sothuc.size(); i++) {
            System.out.println("so thuc ban nhap: " + Sothuc);

        }
    }

}
