package arraylist.assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class bai5 {

    public static void main(String[] args) {
        ArrayList<Integer> delete = new ArrayList<>();
        Random rand = new Random();
        for(int i=0;i<10;i++){ //10 so ngau nhien
            delete.add(rand.nextInt(100)+1); //100 so
        }
        //xoa so o vi tri so 3
        delete.remove(3);
        System.out.println("cac so: " + Arrays.toString(delete.toArray()));
    }

}
//Xóa một phần tử
//Tạo một ArrayList chứa các số nguyên. Thêm mười số ngẫu nhiên từ 1 đến 100.
//Xóa số ở vị trí thứ 3 và in danh sách đã cập nhật.
