package lecture5;

import java.util.Scanner;

public class tinhtong1denN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        int tong = 0;
        for (int i = 1; i < n; i++) {
            tong += n;
        }
        System.out.print("tong 1-n: " + tong);
    }
}
//tinh tong cac so tu 1-n,n nhap tu ban phim1