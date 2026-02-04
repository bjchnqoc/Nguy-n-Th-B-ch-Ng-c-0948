package lec8_ObjectAndClass.ThisKeyword.ClassMethod;

public class S {

    void m() {
        System.out.println("method is invoked");
    }

    void n() {
        this.m();
    }

    public static void main(String[] args) {
        S s1 = new S();
        s1.n();

    }

}
