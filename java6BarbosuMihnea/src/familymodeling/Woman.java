/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familymodeling;

/**
 *
 * @author SkullFlight
 */
public class Woman extends Thread {
    
    private Boolean isSleeping=true;
    private Cigar tigara;
    public void setIsSleeping(Boolean isSleeping) {
        this.isSleeping = isSleeping;
        
    }
    
    public Woman(Cigar c){
         tigara = c;
    }
    
    @Override
    public void run() {
        while (isSleeping)
        {
    System.out.println("Woman is sleeping... and snorting");
    try 
    {
        sleep(2000);
    }
                catch (InterruptedException e) {
            //metoda sleep este intreruptibila.
            System.out.println("I am SleepingThread with thread ID: " + this.getId() + " and I was interrupted :(( ");
return;
            } 
        }
    System.out.println("Woman is watching TV");    }
}
