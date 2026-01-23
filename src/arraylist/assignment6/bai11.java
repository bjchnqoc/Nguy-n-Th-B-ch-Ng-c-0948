package arraylist.assignment6;

import java.util.ArrayList;
import java.util.Random;

public class bai11 {

    public static void main(String[] args) {
        ArrayList<Integer> findminmax = new ArrayList<>();
        Random rand = new Random();
        // Thêm số đầu tiên
        int sodau = rand.nextInt((100) + 1);
        int max = sodau;
        int min = sodau;
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(100) + 1;
            findminmax.add(num);
            if (findminmax.get(i) > max) {
                max = findminmax.get(i);
            }
            if (findminmax.get(i) < min) {
                min = findminmax.get(i);
            }
        }
        System.out.println("10 so nguyen: " + findminmax);
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }

}
//Tìm số lớn nhất và nhỏ nhất
//Tạo một ArrayList gồm 10 số nguyên ngẫu nhiên từ 1 đến 100. Viết chương trình
//để tìm và hiển thị số lớn nhất và nhỏ nhất trong danh sách.

