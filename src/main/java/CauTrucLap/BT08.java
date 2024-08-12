/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CauTrucLap;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BT08 {

    public static void main(String[] args) {
       int n, s=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Tinh tong");
       System.out.println("Nhap so n: ");
       n = sc.nextInt();
       for (int i = 1; i <n; i++) {
           s = s + i;
       }
       System.out.println("Tong = " + s);
    }
}
