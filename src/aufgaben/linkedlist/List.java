package aufgaben.linkedlist;

public class List {

    private class Node{
        Object data;
        Node next;

        @Override
        public boolean equals(Object obj) {
            return data.equals(obj);
        }
    }

    private Node head = null;

    public void append(Object o){
        Node n = new Node();
        n.data = o;

        if(head ==null){
            head = n;
        }else{
            Node p = head;
            while(p.next != null){
                p = p.next;
            }
            p.next = n;
        }
    }

    public void print(){
        if(head == null ){
            System.out.println("Liste ist leer");
        } else{
            Node n = head;
            do {
                System.out.println(n.data.toString());
                n = n.next;
            } while (n.next != null);
            System.out.println(n.data.toString());
        }
    }

    public void insert(Object o){
        if(head ==null){
            append(o);
        }else{
        Node n = new Node();
        n.data = o;
        n.next = head;
        head = n;
        }
    }

    public void delete(Object o){
        if(head == null){
            System.out.println("Nix zu löschen");
            return;
        }
        if(head.data.equals(o)){
            System.out.println(head.data.toString()+ " wurde gelöscht");
            head = null;
        }else{
            Node n = head;
            while(n.next !=null){
                if(n.next.data.equals(o)){
                    System.out.println(n.next.data.toString()+ " wurde gelöscht");
                    n.next = null;
                    return;
                }
            }
            System.out.println("Ende erreicht!");
        }

    }

    public void printBackwards(){
        if(head == null){
            System.out.println("Liste ist leer");
        }else{
            Node n = head;
            ListStack<Object> ls = new ListStack<>();
            while(n !=null){
                ls.push(n);
                n = n.next;
            }
            while(!ls.isEmpty()){
                System.out.println(ls.pop().data);
            }
        }
    }

    public int length(){
        return 0;
    }

    public boolean isEmpty(){
        return false;
    }

    public boolean hasOneElement(){
        return false;
    }


}


class ListTest{
    public static void main(String[] args){
        List list = new List();
        list.delete("");
        list.append("1. Objekt");
        list.append("2. Objekt");
        list.insert("0. Objekt");
        list.printBackwards();
    }
}
