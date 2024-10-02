package spc.edu;

import java.util.ArrayList;

public class Bai24_ArrayList1 {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        ArrayList a = new ArrayList();
        a.add("Loc");
        System.out.println("ArrayList a: " + a);
        ArrayList b = new ArrayList();
        
        for (int i = 1; i < 10; i++){
            b.add(i);
            
        }
        b.add("Loc");
        b.remove(6);
        b.removeLast();
        System.out.print("ArrayList b: ");
        for (int i = 0; i < b.size(); i++){
            System.out.print(b.get(i) + " ");
        }
    }
}