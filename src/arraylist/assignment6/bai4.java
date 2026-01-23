package arraylist.assignment6;

import java.util.ArrayList;
import java.util.Arrays;

public class bai4 {

    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        //them ten cac tpho
        city.add("Da Nang");
        city.add("London");
        city.add("Soeul");
        city.add("Osaka");
        city.add("Ho Chi Minh");
        System.out.println("cac thanh pho : " + Arrays.toString(city.toArray()));
        for (int i = 0; i < city.size(); i++) { //kiem tra cac tpho trong danh sach
            if (city.get(i) == "London") {
                System.out.println("true");
            } else {

            }
        }

    }

}
//Kiểm tra một phần tử
//Viết chương trình tạo một ArrayList chứa các chuỗi ký tự biểu thị tên thành phố. 
//Thêm năm tên thành phố vào danh sách. Kiểm tra xem danh sách có chứa thành phố "London" hay không và in kết quả.
