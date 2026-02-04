
package Lec11.Encapsulation.ExamplePage567;


public class Page5Encapsulation {
    public static void main(String[] args) {
        PersonPage5 a = new PersonPage5();
        
        // Truy cập trực tiếp thế này khiến lớp PersonPage5 không có quyền kiểm soát dữ liệu của chính mình.
        a.name = "Trang"; 
        
        // lỗi logic Giá trị -10 có thể thực hiện được về mặt cú pháp (Possible),
        // nhưng về mặt thực tế là sai hoàn toàn (Not logical).
        a.weight = -10; 

        // Kết quả sẽ in ra giá trị rác, gây lỗi cho các hệ thống tính toán về sau.
        System.out.println(a.name + " nặng " + a.weight + "kg");
    }
}

    
    

