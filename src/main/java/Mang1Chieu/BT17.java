/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mang1Chieu;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class BT17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Khai bao
        double[] a;
        int n;
        Scanner sc = new Scanner (System.in);
        //Doc so phan tu tu ban phim
        System.out.println("Cho biet so phan tu: ");
        n = sc.nextInt();
        //Cap nhat so phan tu cho mang
        a = new double[n];
        //Nhap gia tri cho mang tu ban phim
        nhapMang(a, sc);
        //a.Xuat ra man hinh
        System.out.println("====Mang a====");
        xuatMang(a);
        //b.Tinh trung binh
        double trung_binh_mang =  TinhTrungBinh(a);
        System.out.println("\nTrung binh cua mang: " + trung_binh_mang);
        //c.Tim so nho nhat
        double min = TimMin(a);
        System.out.println("\nGia tri nho nhat cua mang: " + min);
    }
    public static void nhapMang(double[] a, Scanner sc){
        for (int i = 0; i < a.length ; i++) {
            System.out.print("Cho biet gia tri a[" + i +"]:");
            a[i] = sc.nextDouble();
        }
    }
    public static void xuatMang(double[] a) {
            for (double x: a) {
            System.out.print(x + " ");
        }
    }
    public static double TinhTrungBinh(double[] a){
        double sum = 0;
        for (double x : a) {
            sum += x;
        }
        return sum / a.length;
    }
    public static double TimMin(double[] a) {
        double min = a[0];
        for (double x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
}
