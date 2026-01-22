package lecture6.arraylist;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Studentname {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Studentname = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("nhap ten hoc sinh: ");
            Studentname.add(scanner.nextLine());
        }
        System.out.println(Arrays.toString(Studentname.toArray()));
    }

}
