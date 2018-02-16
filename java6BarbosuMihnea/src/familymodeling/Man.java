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
public class Man extends Thread {
    
    private VacuumCleaner vc;
    private TV tv;
    private Woman w;
    
    @Override
    public void run()
    {
        cleaning(vc);
        watchingTV(tv,w);
    }
    
    
    public Man (VacuumCleaner vc, Woman w, TV tv)
    {
        this.vc = vc;
        this.w = w;
        this.tv = tv;
        
    }
    
    private void cleaning(VacuumCleaner vc)
    {
        vc.setIsCleaning(Boolean.TRUE);
    }
    
    private void watchingTV(TV tv, Woman w)
    {
    while(true)
    {
        System.out.println("Man looks at TV");
        try 
    {
        sleep(1000);
    }
                catch (InterruptedException e) {
            //metoda sleep este intreruptibila.
            System.out.println("I am SleepingThread with thread ID: " + this.getId() + " and I was interrupted :(( ");
return;
            } 
        if  (tv.getIsFavoriteShow() == true)
        {
            w.setIsSleeping(Boolean.FALSE);                    
        break;
        }
    }
    }
    
    
}
