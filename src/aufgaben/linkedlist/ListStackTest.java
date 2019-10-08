package aufgaben.linkedlist;

public class ListStackTest {

    public static void main(String[] args){

        List ls = new List();
        Person max = new Person("Muster","Max",new Adresse("Musterstrasse",12,"Musterhausen"));
        Person anna = new Person("Muster","Anna",new Adresse("Musterstrasse",12,"Musterhausen"));

        ls.append(max);
        ls.append(anna);
        ls.print();
    }
}
