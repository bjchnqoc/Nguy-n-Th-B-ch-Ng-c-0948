package lecture6.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class weather2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("how many days' tempartures? ");
        int days = console.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.print("day " + (i + 1) + "'s high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }
        double average = (double) sum / days; //Ép (double) để tránh chia nguyên
        int sodem = 0;
        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                sodem++;
            }
        }
        System.out.printf("average temp = %.1f", average);//in số thực với 1 chữ số thập phân
        System.out.println();
        System.out.println(sodem + " days above average");
        System.out.println("temperatures: " + Arrays.toString(temps));//chuyển mảng thành chuỗi dễ đọc
        Arrays.sort(temps);// sort để sắp  mảng tăng dần 
        System.out.println("2 coldest days: " + temps[0] + " , " + temps[1]);//vị trí sau sắp xếp nhỏ nhất và nhỏ thứ 2
        System.out.println("2 hottest days: " + temps[temps.length - 1] + " , " + temps[temps.length - 2]);
        //phần tử cuối(lớn nhất)+phần tử lớn thứ 2
    }
}
//System.out.printf(" average temp = %.1f", average);|in số thực với 1 chữ số thập phân
//Arrays.sort(temps);| sort để sắp  mảng tăng dần 
