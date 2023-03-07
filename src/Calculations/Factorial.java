/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculations;

import java.math.BigInteger;



/**
 *
 * @author familia
 */
public class Factorial {
    private BigInteger a=BigInteger.valueOf(1);

    public void setA(BigInteger a) {
        this.a = a;
    }
    
    
    public BigInteger calculateFactorial(int b){
        for(int i=2; i<=b; i++){
            a= a.multiply(BigInteger.valueOf(i));
        } return a;
        
    } 
    
}
