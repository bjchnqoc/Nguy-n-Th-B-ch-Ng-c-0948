package Lec11.Encapsulation.AccesModifier.Test1.Rule3;

public class AccessModifier1 {

    private int pvt = 1;    // Chỉ truy cập được trong class này
    int df = 2;             // Mặc định (package-private): Truy cập được trong cùng package
    protected int pro = 3;  // Truy cập được trong cùng package và class con
    public int pbl = 4;     // Truy cập được từ bất cứ đâu

    public void display() {
        // Trong chính nó truy cập được tất cả các biến 

        System.out.println(pvt);
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}
