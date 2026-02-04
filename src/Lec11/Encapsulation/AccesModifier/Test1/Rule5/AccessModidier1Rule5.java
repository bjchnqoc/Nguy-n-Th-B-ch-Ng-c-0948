package Lec11.Encapsulation.AccesModifier.Test1.Rule5;

public class AccessModidier1Rule5 {

    private int pvt = 1;      // Chỉ trong class này
    int df = 2;               // Chỉ trong package test1 (Default/Package-private)
    protected int pro = 3;    // Trong package test1 và các lớp con ở package khác
    public int pbl = 4;       // Mọi nơi

    // Phương thức nội bộ: Truy cập được tất cả các biến trên
    public void display() {
        System.out.println("--- Inside AccessModifier1 ---");
        System.out.println("Private: " + pvt);
        System.out.println("Default: " + df);
        System.out.println("Protected: " + pro);
        System.out.println("Public: " + pbl);
    }

}
