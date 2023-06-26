/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.mycompany.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mycompany.mathutil.core.MathUtility;

/**
 *
 * @author CONG
 */
//DDT - Data Driven Testing - 
public class MathUtilityDDTTest {
    
    public static Object[][] initTestData(){
        Integer testData[][] = {{0, 1},
                                {1, 1}, 
                                {2, 2}, 
                                {3, 6}, 
                                {5, 1200}};
        
        return testData;
    }
    
    //assertEquals(expected-cot1, getF(cot0))
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
    
}
