package arraylist.assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class bai6 {

    public static void main(String[] args) {
        ArrayList<Integer> demso = new ArrayList<>();
        Random rand = new Random();
        int sochan = 0;
        int sole = 0;
        for (int i = 0; i < 15; i++) { //15 so ngau nhien
            demso.add(rand.nextInt(50) + 1); //50 so
            if (demso.get(i) % 2 == 0) {
                sochan++;

            } else {
                sole++;
            }
        }
        System.out.println("cac so: " + Arrays.toString(demso.toArray()));
        System.out.println("so luong so chan: " + sochan);
        System.out.println("so luong so chan: " + sole);
    }

}
//Đếm số lẻ và số chẵn
//Tạo 15 số ngẫu nhiên từ 1 đến 50 và lưu chúng vào một ArrayList.
//Viết chương trình để đếm xem có bao nhiêu số lẻ và bao nhiêu số chẵn trong danh sách.
