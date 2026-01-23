package arraylist.assignment6;

import java.util.ArrayList;


public class bai9 {

    public static void main(String[] args) {
        ArrayList<Integer> maxmin = new ArrayList<>();
        maxmin.add(23);
        maxmin.add(56);
        maxmin.add(67);
        maxmin.add(82);
        maxmin.add(96);
        maxmin.add(16);
        //khoi tao max min = phan tu dau tien
        int max = maxmin.get(0);
        int min = maxmin.get(0);
        // Duyệt ArrayList để tìm max và min
        for (int i = 0; i < maxmin.size(); i++) {
            if (maxmin.get(i) > max) {
                max = maxmin.get(i);
            }
            if (maxmin.get(i) < min) {
                min = maxmin.get(i);
            }
        }
        System.out.println("Danh sach: " + maxmin);
        System.out.println("Gia tri lon nhat: " + max);
        System.out.println("Gia tri nho nhat: " + min);
    }
}
//Tìm phần tử lớn nhất và nhỏ nhất
//Viết chương trình để tạo một ArrayList các số nguyên. Thêm ít nhất năm số vào danh sách.
//Tìm và hiển thị phần tử lớn nhất và nhỏ nhất trong danh sách.

