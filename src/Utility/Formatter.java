/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author familia
 */
public class Formatter {
    
    
    public static String setFormat(BigDecimal x, int scale) {
        
        NumberFormat formatter = new DecimalFormat("0.0E0");
        formatter.setRoundingMode(RoundingMode.HALF_UP);
        formatter.setMinimumFractionDigits(scale);
        return formatter.format(x);
}
}