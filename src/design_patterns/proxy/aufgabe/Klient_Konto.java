package design_patterns.proxy.aufgabe;

public class Klient_Konto {
    public static void main(String[] args){
        System.out.println("Konto wird erstellt....");
        Proxy_Konto konto = new Proxy_Konto(200);
        System.out.println();
        System.out.println("Geld wird eingezhalt...");
        konto.zahleEin(200);
        System.out.println();
        System.out.println("Muss Fehlermeldung geben, da nicht eingeloggt:");
        konto.hebeAb(100);
        System.out.println();
        System.out.println("Login mit Passwort");
        konto.login("passwort");
        System.out.println();
        System.out.println("Mit erfolgreichem Login erhält man nun sein Geld");
        konto.hebeAb(100);
        System.out.println();
        System.out.println("Logout ...");
        konto.logout();
        System.out.println();
        System.out.println("Sollte wieder Fehler geben");
        konto.hebeAb(100);
        System.out.println();
        System.out.println("Test mit anderem Passwort");
        konto.login("");
        konto.hebeAb(200);
        System.out.println();
        konto.login("passwort");
        konto.hebeAb(2000);
    }
}
