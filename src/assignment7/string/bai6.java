package assignment7.string;

import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = "mua xuan ";
        System.out.println(words);
        System.out.print("nhap tu ban muon thay the: ");
        String before = scanner.nextLine();
        System.out.print("nhap tu moi: ");
        String after = scanner.nextLine();
        if (words.contains(before)) { 
        //contains kiểm tra xem từ bạn muốn thay có thực sự tồn tại trong chuỗi không trước khi thực hiện lệnh.
            String kqua = words.replace(before, after);
            System.out.print("sau khi nhap: " + kqua);
        } else {
            System.out.print("khong xuat hien tu nay! ");
        }
    }
}
//6. Thay thế một từ trong chuỗi
//Nhập vào một chuỗi, một từ cần thay thế và từ thay thế, sau đó in ra chuỗi mới.
//Ví dụ:
//Input: "I love Java", thay "Java" bằng "Python"
//Output: "I love Python"

