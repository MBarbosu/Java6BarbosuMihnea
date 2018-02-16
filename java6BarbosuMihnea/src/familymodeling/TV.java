/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familymodeling;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author SkullFlight
 */
public class TV extends Thread{
    Boolean isFavoriteShow = false;

    public Boolean getIsFavoriteShow() {
        return isFavoriteShow;
    }
    
    @Override
    public void run()
    {
       try 
    {
        sleep(4000);
    }
                catch (InterruptedException e) {
            //metoda sleep este intreruptibila.
            System.out.println("I am SleepingThread with thread ID: " + this.getId() + " and I was interrupted :(( ");
return;
            } 
        isFavoriteShow = Boolean.TRUE;
             
               
    }
}
