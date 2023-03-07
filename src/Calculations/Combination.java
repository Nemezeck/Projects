/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculations;

import Calculations.Factorial;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author familia
 */
public class Combination {
    private int num1;
    private int num2;
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
    
    Factorial asd= new Factorial();
    
    public BigDecimal calculateCombination(){
        
        int sub= num1-num2;
        BigDecimal num1Fact= new BigDecimal(asd.calculateFactorial(num1));
        asd.setA(BigInteger.valueOf(1));
        BigDecimal num2Fact= new BigDecimal(asd.calculateFactorial(num2));
        asd.setA(BigInteger.valueOf(1));
        BigDecimal result= new BigDecimal(asd.calculateFactorial(sub));
        asd.setA(BigInteger.valueOf(1));
        result= result.multiply(num2Fact);
        result= num1Fact.divide(result);
        

        return result;
    }
}
