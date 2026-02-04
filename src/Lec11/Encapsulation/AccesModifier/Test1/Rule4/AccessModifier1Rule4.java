package Lec11.Encapsulation.AccesModifier.Test1.Rule4;

public class AccessModifier1Rule4 {

    private int pvt = 1;    // Chỉ trong class này
    int df = 2;             // Mặc định (chỉ trong package test1)
    protected int pro = 3;  // Trong package test1 HOẶC class con ở package khác
    public int pbl = 4;     // Mọi nơi

    public void display() {
       
        System.out.println("Private: " + pvt);
        System.out.println("Default: " + df);
        System.out.println("Protected: " + pro);
        System.out.println("Public: " + pbl);

    }
}
