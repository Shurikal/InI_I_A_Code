package aufgaben.linkedlist;

public class Person {
        String name,firstname, adresse;

        public Person(String name, String firstname, String adresse){
            this.name = name;
            this.firstname = firstname;
            this.adresse = adresse;
        }

        @Override
        public String toString(){
            return ("Vorname \t:\t" +firstname + "\r\nNachname\t:\t" + name + "\r\nAdresse \t:\t" + adresse);
        }
}
