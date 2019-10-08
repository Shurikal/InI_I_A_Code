package aufgaben.linkedlist;

public class Person {
        String name,firstname;
        Adresse adr;

        public Person(String name, String firstname, Adresse adr){
            this.name = name;
            this.firstname = firstname;
            this.adr = adr;
        }

        @Override
        public String toString(){
            return ("Vorname \t:\t" +firstname + "\r\nNachname\t:\t" + name + "\r\nAdresse \t:\t" + adr.toString());
        }
}
