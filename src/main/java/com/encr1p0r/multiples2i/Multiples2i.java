/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encr1p0r.multiples2i;

/**
 *
 * @author presi
 */
public class Multiples2i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Multiples of 7 until 100
        count(7, 1);
        // Multiples of 8 until 200
        count(8, 2);
        // Multiples of 9 until 300
        count(9, 3);
    }
    
    public static void count(int base, int level) {
        int cur = base;
        for(int i = 0; i < level*100; i++) {
            System.out.println(cur);
            cur = cur + base;
        }
    }
}
