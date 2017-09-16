package TestComputer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SkullFlight
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a calculator instance
        Calculator computer = new Calculator();
        // start the calculator
        computer.start();
        // test the add of 123 + 223
        computer.add();
        // test 233 - 122
        computer.decrease();
        // test 123*12
        computer.multiply();
        // test 24:6
        computer.divide();
    }
    
}