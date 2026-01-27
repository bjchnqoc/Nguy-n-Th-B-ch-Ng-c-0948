package assignment7.string;

public class bai2 {

    public static void main(String[] args) {
        String text = " kiem tra dem so tu ";
        String[] tu = text.trim().split("\\s+"); // \\s đại diện cho khoảng trắng (dấu cách, tab, xuống dòng).
        // split de cat tu
        int dem = tu.length;
        System.out.print(" so tu trong chuoi: " + dem);
    }

}
// Đếm số từ trong chuỗi
//Nhập vào một chuỗi và đếm số từ trong chuỗi (giả sử các từ cách nhau bởi dấu cách).

