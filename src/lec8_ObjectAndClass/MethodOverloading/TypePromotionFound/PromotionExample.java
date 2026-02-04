package lec8_ObjectAndClass.MethodOverloading.TypePromotionFound;

public class PromotionExample {

    public void display(int a) {
        System.out.println("Integer: " + a);
    }

    public void display(double a) {
        System.out.println("Double: " + a);
    }

    public static void main(String[] args) {
        PromotionExample obj = new PromotionExample();
        obj.display(5);
        obj.display(5.0);
        obj.display(5L);

    }
}
