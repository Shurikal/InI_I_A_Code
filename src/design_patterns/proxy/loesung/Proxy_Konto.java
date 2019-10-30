package design_patterns.proxy.loesung;

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
        if(passwort.equals(this.passwort)){
            logged_in = true;
            System.out.println("Login erfolgreich");
        }
    }

    public void logout(){
        logged_in = false;
        System.out.println("Logout erfolgreich");
    }

    @Override
    public void hebeAb(int i) {
        if(!logged_in || sparkonto == null){
            System.out.println("Nicht eingeloggt oder Konto nicht vorhanden");
            return;
        }
        sparkonto.hebeAb(i);
    }

    @Override
    public void zahleEin(int i) {
        if(sparkonto !=null) {
            sparkonto.zahleEin(i);
        }
    }
}
