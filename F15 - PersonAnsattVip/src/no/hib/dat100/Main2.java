package no.hib.dat100;

import java.util.Random;

public class Main2 {

    public static void main(String[] args) {
        
        Ansatt anne;
        
        // Simulerer at ein brukar svarar på om person er ein vanleg ansatt eller ein vip.
        Random r = new Random();
        boolean vanlig = r.nextBoolean();
        	
        if (vanlig) {
            anne = new Ansatt("Anne", 1980, "12345", 58);
        }
        else {
            anne = new VipAnsatt("Anne", 1980, "12345", 58);
        }
        
        System.out.println("Lønn Anne : " + anne.beregnMaanedslonn());
    }
}