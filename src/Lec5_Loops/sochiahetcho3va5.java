package Lec5_Loops;

import java.util.Scanner;

public class sochiahetcho3va5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        int soDem = 0;
        int tong=0;
        while( n<3 || 300<n){
            System.out.print("nhap lai so 3-300: ");
            n=scanner.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                soDem++;
                tong+=i;
                System.out.println("cac so chia het cho 3 va 5: " + i);
            }
        }
        System.out.println("tong cac so: "+tong);
        System.out.println("co " + soDem + " chia het cho 3 va 5");
    }
}
//dem va hien thi cac so chia het cho 3 va 5 trong doan tu 1-n, n nhap tu ban phim
