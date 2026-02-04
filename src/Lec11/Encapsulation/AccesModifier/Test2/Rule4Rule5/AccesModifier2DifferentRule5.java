package Lec11.Encapsulation.AccesModifier.Test2.Rule4Rule5;

import Lec11.Encapsulation.AccesModifier.Test1.Rule5.AccessModidier1Rule5;

public class AccesModifier2DifferentRule5 extends AccessModidier1Rule5 {

    @Override
    public void display() {
//        System.out.println(getPvt()); error
//        System.out.println(getDf()); error
//        System.out.println(pro);     error
        System.out.println(pbl);
    }

    public static void main(String[] args) {
        AccessModidier1Rule5 obj = new AccessModidier1Rule5();
        obj.display();
    }
}
