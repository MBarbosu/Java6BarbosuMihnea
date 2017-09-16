/*
 Computer Frame
 */
package TestComputer;

/**
 *
 * @author SkullFlight
 */
public class Calculator {
    
    private Screen ecran;

    public Calculator() {
        this.ecran = new Screen();
    }  
        
    /**
    * Methods adds 2 digits introduced by the user from keyboard
    */
    public void add()
    {
        
    }
   /**
    * Methods subtracts 2 digits introduced by the user
    */
    public void decrease()
    {
    
    }
    
    /**
     * Methods  multiplies 2 digits introduced by the user
     */
    public void multiply()
    {
    
    }
    /**
     * Methods divides 2 numbers introduced by the user
     */
    public void divide()
    {
    
    }
    /**
     * starts the computer - display 0 on the screen
     */
    public void start(){
        
        ecran.display("0");
    }


}
