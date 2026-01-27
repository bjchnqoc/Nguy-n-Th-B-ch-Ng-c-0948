package assignment7.string;

import java.util.Scanner;

public class bai7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String text = scanner.nextLine();
        String num = text.replaceAll("[^0-9]", " ");
//        [^0-9] nghĩa là: "Cái gì KHÔNG PHẢI từ 0 đến 9 thì chọn hết"
        System.out.print(num);
    }

}
//7. Trích xuất số từ chuỗi
//Nhập vào một chuỗi chứa cả chữ và số, trích xuất và in ra tất cả các số trong chuỗi.
//Ví dụ:
//Input: "abc123xyz45"
//Output: 123 45
