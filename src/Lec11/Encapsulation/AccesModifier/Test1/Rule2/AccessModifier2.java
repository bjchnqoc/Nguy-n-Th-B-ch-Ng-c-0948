package Lec11.Encapsulation.AccesModifier.Test1.Rule2;

class AccessModifier2 extends AccessModifier1 {

    @Override
    public void display() {

        // System.out.println(pvt); 
        // LỖI: Không thể truy cập biến private của cha
        System.out.println("Default: " + df);
        System.out.println("Protected: " + pro);
        System.out.println("Public: " + pbl);
    }
}
