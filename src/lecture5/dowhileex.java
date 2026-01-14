package lecture5;

//import java.util.Scanner;
//
//public class dowhileex {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("nhap: ");
//        String n = scanner.nextLine();
//        do {
//            System.out.print("type your password: ");
//            n = scanner.next();
//        } while (!n.equals("duytan"));
//    }
//}
import java.util.Scanner;

public class dowhileex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Type your password: ");
            password = scanner.nextLine();
        } while (!password.equals("duytan"));

        System.out.println("Password correct!");
        scanner.close();
    }
}