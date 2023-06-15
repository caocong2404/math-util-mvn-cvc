/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mycompany.mathutil.main;

import org.mycompany.mathutil.core.MathUtility;


/**
 *
 * @author caocong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Test case 1: n = 0
        System.out.println("Check getF(0) | expected: 1 | actual: " + MathUtility.getFactorial(0));
        
        //Test case 2: n = 1
        System.out.println("Check getF(1) | expected: 1 | actual: " + MathUtility.getFactorial(1));
        
        //Test case 3: n =2
        System.out.println("Check getF(2) | expected: 2 | actual: " + MathUtility.getFactorial(2));
        
        //Test case 4: n=3
        System.out.println("Check getF(3) | expected: 6 | actual: " + MathUtility.getFactorial(3));
        
        //Test case 5: n=5
        System.out.println("Check getF(5) | expected: 120 | actual: " + MathUtility.getFactorial(5));
        
        //Test case 6: n=-1
        System.out.println("Check getF(-1) | expected: Exception | actual: ");
        MathUtility.getFactorial(-1);
    }
    //Thiế kế hàm giai thừa: âm giai thừa và >20! thì ko tính đc
    //Hàm sẽ ném ra ngoại lệ
    //ta đã có hàm tính giai thừa, phải tets hàm
        //test thông qua các test case, những tình huống xài hàm
        //chuẩn bị bộ data và expected value
        //sau đó run các test case để coi đúng sai
        
        //test case 1: check if getF() return well with n = 0;
        //Steps/Procedures
        //input n = 0 to the function/method - Given n = 0
        //- run the method to get the actual value of 0! - Excute getF(n=0) 
        //EXCEPTED: 0! must be is 1, excepted value = 1 - EXPECTED VALUE: (hàm hy vọng sẽ trả về mấy)
    
        //test case 2: check if getF() return well with n = 0;
        //Steps/Procedures
        //input n = 1 to the function/method - Given n = 1
        //- run the method to get the actual value of 1! - Excute getF(n = 1) 
        //EXCEPTED: 1! must be is 1, excepted value = 1 - EXPECTED VALUE: (hàm hy vọng sẽ trả về mấy)

        //TDD: Test driven development: Viết code theo style 
        //Code và test song hành với nhau
        //Code và test code là cạp bài trùng, code liên tục đc test
        //dù mới viết sơ sơ
        //phải nghĩ ngay đến test case khi bắt đầu viết code
        //Đặc trưng của TDD: xanh xnah đỏ đỏ
    
}
