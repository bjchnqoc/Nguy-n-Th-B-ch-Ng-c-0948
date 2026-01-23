package arraylist.assignment6;

import java.util.ArrayList;

public class bai7 {

    public static void main(String[] args) {
        ArrayList<Integer> daonguoc = new ArrayList<>();
        daonguoc.add(23);
        daonguoc.add(12);
        daonguoc.add(60);
        daonguoc.add(55);
        daonguoc.add(76);
        System.out.println("mang so nguyen: " + daonguoc);
        for (int i = 0; i < daonguoc.size() / 2; i++) {
            int mangNguoc = daonguoc.get(i);
            daonguoc.set(i, daonguoc.get(daonguoc.size() - 1 - i));//là vị trí đối xứng
            daonguoc.set(daonguoc.size() - 1 - i, mangNguoc);
        }

        System.out.println("mang dao nguoc: " + daonguoc);
    }

}

//Đảo ngược một ArrayList
//Viết chương trình để tạo một ArrayList các số nguyên. Thêm năm số vào danh sách.

//Đảo ngược thứ tự các phần tử trong danh sách và hiển thị danh sách đã đảo ngược.
//notes:
//Mảng thường	ArrayList
//length	size()
//arr[i]	get(i)
//arr[i] = x	set(i, x)