package no.hib.dat100;

public class Main3 {

    public static void main(String[] args) {
        
        Ansatt[] ansatte = new Ansatt[4];
        
        ansatte[0] = new Ansatt(   "Anne",  1980, "12345", 58);
        ansatte[1] = new VipAnsatt("Vidar", 1970, "67890", 58);
        ansatte[2] = new Ansatt(   "Arne",  1980, "12345", 65);
        ansatte[3] = new VipAnsatt("Liv", 1970, "67890", 65);
        
        for (Ansatt a : ansatte) {
            System.out.println(a.getNavn()
                    + ": Lønnstrinn = " + a.getLonnstrinn() 
                    + ", Beregnet lønn = " + a.beregnMaanedslonn());
        }
    }
}