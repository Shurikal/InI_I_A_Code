package aufgaben.linkedlist;

public class Adresse {
    private String strasse;
    private int number;
    private String ort;


    public Adresse(String strasse,int number ,String ort){
        this.strasse = strasse;
        this.number = number;
        this.ort = ort;
    }

    public String toString(){
        return (strasse + " " + number + " " + ort);
    }
}
