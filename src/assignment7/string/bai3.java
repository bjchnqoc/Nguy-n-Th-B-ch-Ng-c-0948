package assignment7.string;

public class bai3 {

    public static void main(String[] args) {
        String kitu = " xin chao ";
        //dung stringbuilder vi co san reverse
    
        StringBuilder chuoi = new StringBuilder(kitu);
        chuoi.reverse();
        String nguoc = chuoi.toString();
        System.out.print("chuoi dao nguoc: " + nguoc);

    }
}

//3. Đảo ngược chuỗi
//Viết chương trình nhập vào một chuỗi và xuất ra chuỗi đảo ngược của nó.
//Ví dụ:
//Input: "Hello"
//Output: "olleH"

