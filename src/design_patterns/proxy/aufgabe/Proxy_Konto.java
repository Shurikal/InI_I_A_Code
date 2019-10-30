package design_patterns.proxy.aufgabe;

public class Proxy_Konto implements Konto {
    private String passwort = "passwort";
    private boolean logged_in = false;
    private Real_Konto sparkonto;

    public Proxy_Konto(int i){
        if(i > 0) {
            sparkonto = new Real_Konto(i);
            return;
        }
        System.out.println("Kann kein negatives Konto erstellen");
    }

    public void login(String passwort){
        //Dein Code hier
    }

    public void logout(){
       //Dein Code Hier
    }

    @Override
    public void hebeAb(int i) {
        //Dein Code hier
        sparkonto.hebeAb(i);
    }

    @Override
    public void zahleEin(int i) {
        //Dein Code hier
            sparkonto.zahleEin(i);
    }
}
