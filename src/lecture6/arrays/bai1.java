package lecture6.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class bai1 {

    public static void cau1(int mang, int soNguyen[]) {
        System.out.println("mang so nguyen: " + Arrays.toString(soNguyen));
    }
// in mảng ngược

    public static void cau2(int mang, int soNguyen[]) {
        for (int i = 0; i < soNguyen.length / 2; i++) {
            int mangNguoc = soNguyen[i];
            soNguyen[i] = soNguyen[soNguyen.length - 1 - i];//
            soNguyen[soNguyen.length - 1 - i] = mangNguoc;
        }

        System.out.println("mang dao nguoc: " + Arrays.toString(soNguyen));
    }
    //in các số chẵn trong mảng

    public static void cau3(int mang, int soNguyen[]) {
        System.out.print("cac so chan trong mang: ");
        for (int i = 0; i < mang; i++) {
            if (soNguyen[i] % 2 == 0) {
                System.out.print(soNguyen[i] + " ");
            }
        }
        System.out.println();
    }
//tính tổng các thành phần chia hết cho 3 và 5

    public static void cau4(int mang, int soNguyen[]) {
        int sum = 0;
        for (int i = 0; i < mang; i++) {
            if (soNguyen[i] % 3 == 0 && soNguyen[i] % 5 == 0);
            sum += soNguyen[i];
        }
        System.out.println("tong = " + sum);
    }
    //Sắp xếp mảng tăng dần

    public static void cau5(int mang, int soNguyen[]) {
        Arrays.sort(soNguyen);// sort để sắp  mảng tăng dần 
        System.out.println("mang tu nho den lon: " + Arrays.toString(soNguyen));
    }
//sắp xếp mảng giảm dần

    public static void cau6(int mang, int soNguyen[]) {
        for (int i = 0; i < soNguyen.length / 2; i++) {
            int mangNguoc = soNguyen[i];
            soNguyen[i] = soNguyen[soNguyen.length - 1 - i];
            soNguyen[soNguyen.length - 1 - i] = mangNguoc;
        }
        System.out.println("mang tu lon den nho: " + Arrays.toString(soNguyen));
    }

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
        cau1(mang,soNguyen);
        cau2(mang,soNguyen);
        cau3(mang,soNguyen);
        cau4(mang,soNguyen);
        cau5(mang,soNguyen);
        cau6(mang,soNguyen);
    }
}
