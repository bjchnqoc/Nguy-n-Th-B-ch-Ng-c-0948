package arraylist.assignment6;
import java.util.ArrayList;

public class bai3 {
    public static void main(String[] args){
        ArrayList<Double> gia = new ArrayList<>();
        gia.add(20.000);
        gia.add(35.000);
        gia.add(55.000);
        gia.add(60.000);
        gia.add(45.000);
        for(int i=0;i<gia.size();i++){
        System.out.println("gia san pham : " +gia.get(i) );
    }
}
}
//Lặp qua một ArrayList
//Tạo một ArrayList chứa các giá trị kiểu double biểu thị giá của sản phẩm. 
//Sử dụng vòng lặp for để hiển thị tất cả các giá trong danh sách.