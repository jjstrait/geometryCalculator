/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Joshua
 */
public class geometryCalculator {
    
    public double calculateArea(String length,String width) throws Exception{
       
        try {
            double l = Double.parseDouble( length );
            double w = Double.parseDouble( width );
            return l*w;
        }catch( Exception e ) {
            throw new Exception("Value input was not a number");
        }
        
    }
    
    
    
    
   
    
}
