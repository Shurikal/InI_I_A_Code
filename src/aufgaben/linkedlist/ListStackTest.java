package aufgaben.linkedlist;

public class ListStackTest {

    public static void main(String[] args){

        ListStack<Person> ls = new ListStack<>();
        Person max = new Person("Muster","Max",new Adresse("Musterstrasse",12,"Musterhausen"));
        Person anna = new Person("Muster","Anna",new Adresse("Musterstrasse",12,"Musterhausen"));

        ls.push(max);
        ls.push(anna);
        System.out.println(ls.pop().toString());
        System.out.println(ls.pop().toString());
    }
}
