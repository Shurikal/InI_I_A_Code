package aufgaben.linkedlist;

public class ListStackTest {

    public static void main(String[] args){

        List ls = new List();
        Person max = new Person("Muster","Max","Musterstrasse");
        Person anna = new Person("Muster","Anna","Musterstrasse");

        ls.append(max);
        ls.append(anna);
        ls.print();
    }
}
