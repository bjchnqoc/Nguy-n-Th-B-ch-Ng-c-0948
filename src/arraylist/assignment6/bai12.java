package arraylist.assignment6;

import java.util.ArrayList;
import java.util.Random;

public class bai12 {

    public static void main(String[] args) {
        ArrayList<Integer> sum = new ArrayList<>();
        Random rand = new Random();
        int tong = 0;
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(100) + 1;// số ngẫu nhiên 1–100
            sum.add(num);// thêm vào ArrayList
            tong += num;// cộng vào tổng
        }
        System.out.println("10 so ngau nhien: " + sum);
        System.out.println("Tong cac phan tu: " + tong);
    }

}
//Tổng của các số ngẫu nhiên
//Tạo 10 số ngẫu nhiên từ 1 đến 100, lưu chúng vào một ArrayList,
//và tính tổng của tất cả các phần tử.
