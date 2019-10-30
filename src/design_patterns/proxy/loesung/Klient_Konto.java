package design_patterns.proxy.loesung;

public class Klient_Konto {
    public static void main(String[] args){
        Proxy_Konto konto = new Proxy_Konto(200);
        konto.zahleEin(200);
        konto.hebeAb(100);
        konto.login("passwort");
        konto.hebeAb(100);
        konto.logout();
        konto.hebeAb(100);
        konto.login("");
        konto.hebeAb(200);
        konto.login("passwort");
        konto.hebeAb(2000);
    }
}
