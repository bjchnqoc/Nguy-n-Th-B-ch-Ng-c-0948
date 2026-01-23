package arraylist.assignment6;
import java.util.ArrayList;

public class bai8 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("grape");
        fruits.add("strawberry");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("lemon");
        ArrayList<String> fruitsCopy=new ArrayList<>();
        fruitsCopy.addAll(fruits);//addAll: them tat ca cac phan tu
        
        System.out.println("Danh sach fruits: " + fruits);
        System.out.println("Danh sach fruitsCopy: " + fruitsCopy);
    }
    
}
 
//Sao chép một ArrayList
//Tạo một ArrayList các chuỗi đại diện cho các loại trái cây. Thêm năm tên trái cây vào danh sách.
//Sao chép các phần tử của danh sách này vào một ArrayList khác và hiển thị cả hai danh sách.