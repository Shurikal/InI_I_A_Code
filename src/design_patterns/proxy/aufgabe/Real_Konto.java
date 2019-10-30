package design_patterns.proxy.aufgabe;

public class Real_Konto implements Konto {
    private int kontoStand;

    public Real_Konto(int i){
        kontoStand = i;
        System.out.println("Konto mit "+ kontoStand +" erstellt!");
    }

    @Override
    public void hebeAb(int i) {
        int kontoStandneu = kontoStand -i;
        if(kontoStandneu >=0){
            kontoStand = kontoStandneu;
            System.out.println("Hier ist dein Geld "+i);
            return;
        }
        System.out.println("Konnte Geld nicht abheben!");
    }

    @Override
    public void zahleEin(int i) {
        if(i >= 0){
            kontoStand += i;
            System.out.println("Neuer Kontostand "+ kontoStand);
        }
    }
}
