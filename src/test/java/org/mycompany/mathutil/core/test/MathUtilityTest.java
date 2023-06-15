/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.mycompany.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import static org.mycompany.mathutil.core.MathUtility.*;

/**
 *
 * @author CONG
 */
public class MathUtilityTest {
    //test exception
    @Test //(expected = ten-ngoai-le.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        //      ngoai le can bat - doan code gay ra ngoai le (objecct)
        //                       - dua 1 object chua doan code gay Exception
        //                         Lambda exception
        
        //assertThrows(expectedType, executable);

//        Executable exAno = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };
//        
//        Executable exLambda = () -> getFactorial(-5);
        
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        //assertEquals(68, 69);
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
    }
    
    
    
}
