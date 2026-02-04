package Lec11.Encapsulation.AccesModifier.Test1.Rule3;

public class AccessModidier2 {

    public void display() {
        AccessModifier1 object = new AccessModifier1();

        // System.out.println(object.pvt); // lỗi pvt là private, không thể nhìn thấy từ class khác
        System.out.println(object.df);    //  Cùng package
        System.out.println(object.pro);   // Cùng package
        System.out.println(object.pbl);   // Public
    }
}
