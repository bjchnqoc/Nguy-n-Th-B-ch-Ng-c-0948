package Lec11.Encapsulation.AccesModifier.Test2.Rule4Rule5;

import Lec11.Encapsulation.AccesModifier.Test1.Rule4.AccessModifier1Rule4;

public class AccessModifier2DifferentRule4 extends AccessModifier1Rule4 {

    @Override
    public void display() {
        // System.out.println(pvt); //  Private không thể truy cập từ class con khác package
        // System.out.println(df);  //  Default không thể truy cập từ package khác

        System.out.println(pro);    // Protected cho phép class con truy cập
        System.out.println(pbl);    // Public truy cập mọi nơi
    }

    public static void main(String[] args) {
        AccessModifier2DifferentRule4 obj = new AccessModifier2DifferentRule4();
        obj.display();
    }
}
