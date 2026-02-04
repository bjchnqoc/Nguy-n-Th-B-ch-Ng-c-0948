package Lec11.Encapsulation.AccesModifier.Test1.Rule1;

public class AccessModifier {

    /* Rule 1: Trong cùng một Class (Same class)
   Tất cả các Access Modifiers (private, default, protected, public) 
   đều có thể truy cập được bởi các phương thức bên trong class đó. */
    // 1. Private: Chỉ truy cập được trong nội bộ class này
    private int pvt = 1;

    // 2. Default: Không ghi từ khóa, truy cập được trong cùng package
    int df = 2;

    // 3. Protected: Truy cập được trong cùng package và class con (inheritance)
    protected int pro = 3;

    // 4. Public: Truy cập được từ bất cứ đâu
    public int pbl = 4;

    // Phương thức hiển thị: Có thể truy cập TẤT CẢ các biến trên
    public void display() {
        System.out.println("Giá trị Private: " + pvt);
        System.out.println("Giá trị Default: " + df);
        System.out.println("Giá trị Protected: " + pro);
        System.out.println("Giá trị Public: " + pbl);
    }

    public static void main(String[] args) {
        // Vì display() không phải hàm static, ta cần tạo đối tượng
        AccessModifier obj = new AccessModifier();

        // Gọi hàm display để in kết quả
        obj.display();
    }
}
