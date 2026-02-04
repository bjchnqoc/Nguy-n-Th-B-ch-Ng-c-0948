package Lec11.Encapsulation.AccesModifier.Test1.Rule2;

public class AccessModifier1 {

    // Chỉ truy cập được trong nội bộ class này
    private int pvt = 1;

    // Truy cập được trong cùng package (test1)
    int df = 2;

    // Truy cập được trong cùng package và class con
    protected int pro = 3;

    // Truy cập được từ mọi nơi
    public int pbl = 4;

    public void display() {

        System.out.println("Private: " + pvt);
        System.out.println("Default: " + df);
        System.out.println("Protected: " + pro);
        System.out.println("Public: " + pbl);
    }
}
