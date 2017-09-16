/*
 * Screen of computer
 */
package TestComputer;

/**
 *Class Screen implements behaviour of screen
 */
public class Screen {

    String screenMemory;
    
    public Screen() {
        screenMemory = "Display:";
    }
    
    
    
    public void display(String deAfisat)
    {
        screenMemory += deAfisat;
      
        System.out.println(screenMemory);
    } 
    
    }

