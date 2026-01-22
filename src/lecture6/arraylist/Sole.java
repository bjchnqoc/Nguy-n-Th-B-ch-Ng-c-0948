package lecture6.arraylist;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Sole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> Sole = new ArrayList<>();
        System.out.print("nhap so luong so nguyen: ");
        int soluong = scanner.nextInt();
        for (int i = 0; i < soluong; i++) {
            System.out.print("nhap so nguyen thu: " + (i + 1) + " : ");
            Sole.add(scanner.nextInt());
        }
        System.out.print("Cac so le trong mang: ");
        for (int i = 0; i < Sole.size(); i++) {
            if (Sole.get(i) % 2 != 0) {
                System.out.print(Sole.get(i) + " ");
            }
        }
    }
}
