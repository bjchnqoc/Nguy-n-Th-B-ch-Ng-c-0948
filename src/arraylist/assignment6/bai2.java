package arraylist.assignment6;

import java.util.ArrayList;
import java.util.Arrays;

public class bai2 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("pink");
        colors.add("gray");
        colors.add("black");
        colors.add("white");
        colors.add("brown");
        colors.remove("gray");
        colors.add(1,"yellow");//thay the vi tri so 1 bang mau vang
        System.out.println("cac mau : " + Arrays.toString(colors.toArray()));
    }

}
//Cập nhật một phần tử
//Viết chương trình tạo một ArrayList chứa các chuỗi ký tự. Thêm năm màu vào danh sách.
//Thay thế màu thứ hai bằng "Vàng" và hiển thị danh sách đã cập nhật.
