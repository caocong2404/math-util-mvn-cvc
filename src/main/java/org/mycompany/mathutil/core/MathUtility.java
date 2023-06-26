/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mycompany.mathutil.core;

/**
 *
 * @author CONG
 */
//clone class java.util.Math cua JDK
public class MathUtility {
    public static final double PI = 3.1415;
    
    //tinh giai thua`
    //not accept n > 20 because 21! > long
//    public static long getFactorial(int n) {
//        //TODO...
//        long result = 1;
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
//        
//        if (n == 0 || n == 1)
//            return 1;
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//        
//        return result;
//        //return n * getFactorial(n- 1);
//        
//    }
    public static long getFactorial(int n) {
        //TODO...
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1;
        return n * getFactorial(n - 1);
        //return n * getFactorial(n- 1);
        
    }
    //return som de ham` ko bao oi
}
