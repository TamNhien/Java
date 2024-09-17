/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class Bai13_BangCc {
    public static void main(String[] args) {
        System.out.println("Bang Cuu Chuong");
        int i,j;
        for (i = 1; i <= 10; i++){
            for (j = 1; j <= 10; j++){
                System.out.printf("%d x %d = %-4d\t", i, j, i * j);
            }
            System.out.println();
        }
    }
}