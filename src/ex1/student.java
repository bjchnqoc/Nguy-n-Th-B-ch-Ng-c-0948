/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author computer
 */
import java.util.Scanner;
public class student {
    public static void main(String[] args){
        Scanner hoten=new Scanner(System.in);
        System.out.print(" nhap ho va ten: ");
        String ht=hoten.nextLine();
        System.out.println(ht);
        
        Scanner id = new Scanner(System.in);
        System.out.print(" nhap id: ");
        int i= id.nextInt();
        System.out.println(i);
        
        Scanner baitap=new Scanner(System.in);
        System.out.print(" nhap bai tap : ");
        String bt=baitap.nextLine();
        System.out.println(bt);
        
        Scanner gpa=new Scanner(System.in);
        System.out.print(" nhap gpa: ");
        Float diem=gpa.nextFloat();
        System.out.println(diem);
        
        Scanner nganh=new Scanner(System.in);
        System.out.print(" nhap chuyen nganh : ");
        String mayjor=nganh.nextLine();
        System.out.println(mayjor);
        
        Scanner hocbong = new Scanner(System.in);
        System.out.print("co hoc bong : ");
        boolean hb = hocbong.nextBoolean();
        System.out.println(hb);
    }
    
}
