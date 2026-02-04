package Lec11.Encapsulation.Final.FinalClass;

//nếu dùng final thì không thể tạo thêm class con
class Bike { //xoá final

    void run() {
        System.out.println("running");
    }
}

class Honda extends Bike {

    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}
