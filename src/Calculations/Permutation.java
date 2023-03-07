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
public class Permutation {
    
    
    Factorial asd= new Factorial();
    
    
    
    public BigDecimal calculatePermutation(int r){
        int sub= 365-r;
        BigDecimal daysFact= new BigDecimal(asd.calculateFactorial(365));
        asd.setA(BigInteger.valueOf(1));
        BigDecimal subFact= new BigDecimal(asd.calculateFactorial(sub));
        asd.setA(BigInteger.valueOf(1));
        BigDecimal result= daysFact.divide(subFact);
        return result;
    }
}
