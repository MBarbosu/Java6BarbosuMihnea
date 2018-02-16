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
public class FamilyScene {

    
    public static void main(String[] args) {
        
    Cigar tigara = new Cigar();
    Woman femeie = new Woman(tigara);
    VacuumCleaner aspirator = new VacuumCleaner();
    TV televizor = new TV();
    Man barbat = new Man(aspirator,femeie,televizor);
    
    barbat.start();
    aspirator.start();
    televizor.start();
    tigara.start();
    femeie.start();
    
    }
    
}
