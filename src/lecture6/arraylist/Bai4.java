package lecture6.arraylist;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Bai4 {
//cau a:in ra mang
    public static void cauA(int mang, int soNguyen[]) {
        System.out.println("mang so nguyen: " + Arrays.toString(soNguyen));
    }
//cau b:in ra so chan o vi tri nao va dem 
    public static void cauB(int mang, int soNguyen[]) {
        int soDem = 0;
        System.out.println("cac so chan trong mang va vi tri ");
        for (int i = 0; i < mang; i++) {
            if (soNguyen[i] % 2 == 0) {
                System.out.println("So chan: " + soNguyen[i] + " tai vi tri: " + i);
                soDem++;
            }
        }
        System.out.println("Co " + soDem + " so chan");
    }
//cau c:tinh tong mang do
    public static void cauC(int mang, int soNguyen[]) {
        int tong = 0;
        for (int i = 0; i < mang; i++) {
            tong += soNguyen[i];
        }
        System.out.println("Tong cac phan tu trong mang = " + tong);
    }
//cau d:loai bo gia tri trong mang
    public static void cauD(int mang, int soNguyen[], int x) {
        int soDem = 0;
        // Đếm số phần tử khác x
        for (int i = 0; i < mang; i++) {
            if (soNguyen[i] != x) {
                soDem++;
            }
        }
        int[] mangMoi = new int[soDem];
        int j = 0;
        // Sao chép các phần tử khác x sang mảng mới
        for (int i = 0; i < mang; i++) {
            if (soNguyen[i] != x) {
                mangMoi[j] = soNguyen[i];
                j++;
            }
        }
        System.out.println("Mang sau khi loai bo " + x + ": " + Arrays.toString(mangMoi));
    }

//    ham chinh(main)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap kich thuoc mang so nguyen: ");
        int mang = scanner.nextInt();
        int[] soNguyen = new int[mang];
        System.out.println("nhap gia tri mang so nguyen ");
        for (int i = 0; i < mang; i++) {
            System.out.print("nhap gia tri so " + (i + 1) + ": ");
            soNguyen[i] = scanner.nextInt();
        }
        cauA(mang, soNguyen);
        cauB(mang, soNguyen);
        cauC(mang, soNguyen);
        System.out.print("Nhap gia tri can loai bo: ");
        int x = scanner.nextInt();
        cauD(mang, soNguyen, x);
    }
}
