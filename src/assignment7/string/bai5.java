package assignment7.string;

public class bai5 {

    public static void main(String[] args) {
        String chuoi = " Nguyen Thi Bich Ngoc! ";
        char ktu = 'i';
        int sodem = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == ktu) {
                sodem++;
            }
        }
        System.out.println("so lan ky tu " + ktu + " xuat hien trong chuoi: " + sodem);
    }
}
//5. Đếm số lần xuất hiện của một ký tự trong chuỗi
//Nhập vào một chuỗi và một ký tự, đếm số lần ký tự đó xuất hiện trong chuỗi.
//Ví dụ:
//Input: "banana", 'a'
//Output: 3
