package arraylist.assignment6;

import java.util.ArrayList;
import java.util.Arrays;

public class bai1 {

    public static void main(String[] args) {
        ArrayList<Integer> N = new ArrayList<>();
        N.add(1);
        N.add(2);
        N.add(3);
        N.add(4);
        N.add(5);
        N.add(6);
        N.add(7);
        N.add(8);
        N.add(9);
        N.add(10);
        System.out.println("cac so tu 1-10: " + Arrays.toString(N.toArray()));
    }

}
//Tạo và điền phần tử vào ArrayList
//Viết chương trình tạo một ArrayList chứa các số nguyên. Thêm các số từ 1 đến 10 vào danh sách và hiển thị các phần tử.
