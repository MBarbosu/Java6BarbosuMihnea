/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stringzzzzz;

import java.util.Scanner;
import static jdk.nashorn.internal.parser.TokenType.DO;

/**
 *
 * @author SkullFlight
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner newScanner = new Scanner(System.in);
        String readit = newScanner.nextLine();
        
    char caractere[] = new char[200];
    readit.getChars(0, readit.length()-1, caractere, 0);
    
    for (char c : caractere)
    {
        boolean daca = Character.isUpperCase(c);
        if (daca)
            System.out.println(c);
    }
          
    }
    
}
