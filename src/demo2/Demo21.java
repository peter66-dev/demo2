/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Demo21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        a = 3;
        b = 2;
        int result1 = Sub(a, b);
        int result2 = Sum(a, b);
        System.out.println(result1);
    }

    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Sub(int a, int b) {
        return a - b;
    }

}
