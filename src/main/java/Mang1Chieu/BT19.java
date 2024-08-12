/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mang1Chieu;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author DELL
 */
public class BT19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a;
        int n;
        Scanner sc = new Scanner (System.in);
        n = docSoPhanTu(sc);
        a = new int[n];
        phatSinhMang(a);
        //a.Xuat mang ra man hinh
        System.out.println("\nNhung mang duoc phat sinh gom:");
        XuatMang(a);
        System.out.println("\nPhan tu sau khi sap xep:"  );
        sapXepTang(a);
        XuatMang(a);
        //b.
    }
    public static void XuatMang(int[] a) {
        for (int x : a) {
            System.out.println(x + " ");
        }
    }
    public static void phatSinhMang(int[] a) {
        Random rd = new Random();
        for (int i = 0; i <a.length; i++) {
            a[i]= rd.nextInt(100);
        }
    }
    public static int docSoPhanTu(Scanner sc) {
        int n = 0;
        do {
            System.out.print("Cho biet so PTM: ");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);
        return n;
    }
    public static void sapXepTang(int[] a) {
        Arrays.sort(a);
    }
}
