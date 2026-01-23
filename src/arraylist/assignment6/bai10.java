package arraylist.assignment6;

import java.util.ArrayList;

public class bai10 {

    public static void main(String[] args) {
        ArrayList<String> Names = new ArrayList<>();
        Names.add("Nguyen");
        Names.add("Lam");
        Names.add("Ngoc");
        Names.add("Quyen");
        Names.add("Hung");
        Names.add("Thuan");
        Names.add("Phuc");
        Names.add("Phuc");
        Names.add("Lam");
        Names.add("Ngoc");
        System.out.println("danh sach ban dau: " + Names);
        ArrayList<String> ten = new ArrayList<>();
        for (int i = 0; i < Names.size(); i++) {
        //contains:kiểm tra tên đó đã có trong ten chưa ; '!' nghĩa là chưa có
        // Nếu chưa có → thêm vào ten. Nếu đã có → bỏ qua (không thêm)
            if (!ten.contains(Names.get(i))) { 
                ten.add(Names.get(i));
            }
        }
        System.out.println("danh sach khong trung lap: " + ten);
    }
}
//Loại bỏ các phần tử trùng lặp khỏi một ArrayList
//Viết chương trình để tạo một ArrayList các chuỗi đại diện cho tên. 
//Thêm một số tên, bao gồm cả các tên trùng lặp, vào danh sách. 
//Xóa các phần tử trùng lặp và hiển thị danh sách không có phần tử trùng lặp
