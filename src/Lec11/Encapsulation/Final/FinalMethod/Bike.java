package Lec11.Encapsulation.Final.FinalMethod;

class Bike {

    final void run() { // Phương thức final
        System.out.println("running");
    }
}

class Honda extends Bike {
    // Sẽ gây lỗi Compile Time Error nếu cố gắng ghi đè phương thức run()
    // void run() { System.out.println("running safely with 100kmph"); }

    public static void main(String args[]) {
        Honda honda = new Honda();
        honda.run();
    }
}
