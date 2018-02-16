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
public class VacuumCleaner extends Thread {
    private Boolean isCleaning = Boolean.FALSE;

    public void setIsCleaning(Boolean isCleaning) {
        this.isCleaning = isCleaning;
    }
    
    
    
    @Override
    public void run()
    {
       
       if (isCleaning)
           System.out.println("Vrooom....");
    }
    
}
