/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CauTrucReNhanh;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BT01 {
    public static void main(String[] args) {
        double a,b;
        String kq;
        Scanner sc = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac 1");
        System.out.println("Nhap he so a: ");
        a = sc.nextDouble();
        System.out.println("Nhap he so b: ");
        b = sc.nextDouble();
        if(a==0){
            if(b==0){
                kq="Phuong trinh vo so nghiem";
            } else {
                kq="Phuong trinh vo nghiem";
            }
        } else {
            kq="Phuong trinh co nghiem: " + (-b/a);
        }
        System.out.println(kq);
    }
}
