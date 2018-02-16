/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleCalculator;

import java.util.Scanner;

/**
 *
 * @author SkullFlight
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please insert your first operand:");
        
       Scanner newScanner = new Scanner(System.in);
        String readit = newScanner.nextLine();
        Double firstOperand = Double.valueOf(0);
        try{
        firstOperand = Double.valueOf(readit);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid number format");
            System.exit(0);
        }
        
        System.out.println("You introduced operand: ");
        System.out.println(readit);
        
        System.out.println("Please insert your first operator");
        
        newScanner = new Scanner(System.in);
        readit = newScanner.nextLine();
        Character operand = readit.charAt(0);
        if ((operand!='+' )&&(operand!='-' )&&(operand!='*' )&&(operand!='/' ))
        {
        System.out.println("Invalid Operator");
        System.exit(0);
        }
        
        
        
        System.out.println("Please insert your second operand:");
        newScanner = new Scanner(System.in);
        readit = newScanner.nextLine();
        Double secondOperand = Double.valueOf(0);
        try{
        secondOperand = Double.valueOf(readit);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid number format");
            System.exit(0);
        }
        
        System.out.println("You introduced operand: ");
        System.out.println(readit);
        
        
        switch(operand){
            case'+':
                System.out.println(firstOperand+secondOperand);
                break;
            case'-':
                System.out.println(firstOperand-secondOperand);
                break;   
            case'*':
                System.out.println(firstOperand*secondOperand);
                break;  
            case'/':
                System.out.println(firstOperand/secondOperand);
                break;     
        }
        
    }
    
}
