/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Bai24_ArrayList1 {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        ArrayList a = new ArrayList();
        a.add("Loc");
        System.out.println("ArrayList a: " + a);
        ArrayList b = new ArrayList();
        
        for (int i = 1; i < 10; i++){
            //String x = b.get(""+i+"");
            b.add(i);
            
        }
        b.add("Loc");
        b.remove(6);
        b.removeLast();
        System.out.print("ArrayList b: ");
        for (int i = 0; i < b.size(); i++){
           //String x = (String) ;
            System.out.print(b.get(i) + " ");
            //b.remove(7);
        }
    }
}