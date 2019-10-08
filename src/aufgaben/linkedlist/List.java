package aufgaben.linkedlist;

public class List {

    /**
     * Inner Class for generating a single Linked List
     */
    private class Node{
        Object data;
        Node next;

        /**
         * Overrides the equal Method of the Node class with the one of the Object in it
         * @param obj
         * @return
         */
        @Override
        public boolean equals(Object obj) {
            return data.equals(obj);
        }
    }

    private Node head = null;

    /**
     * Appends an Object at the end of the list
     * @param o Object to append
     */
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

    /**
     * Prints all Objects in the list with the toString() Method
     */
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

    /**
     * Inserts an Object at the beginning of the list
     * @param o Object to insert
     */
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

    /**
     * Deletes ALL objects in the list equal to Object o
     * @param o Object to delete
     */
    public void delete(Object o){
        Node n0 = head;
        if(n0==null){
            return;
        }
        while(n0!=null && n0.equals(o)){
            head = n0.next;
            n0 = head;
        }
        Node n1 = head.next;
        while(n1!=null){
            if(n1.equals(o)){
                n0.next = n1.next;
            }
            n0 = n1;
            n1=n1.next;
        }
    }

    /**
     * Print the list backwards
     */
    public void printBackwards(){
        if(head == null) {
            System.out.println("Liste ist leer");
            return;
        }
        SingleLinkedList<Node> ls = new SingleLinkedList<>();
        Node n = head;
        while(n!=null){
            ls.push(n);
            n = n.next;
        }
        while(!ls.isEmpty()){
            Node n1 =  ls.pop();
            System.out.println(n1.data.toString());
        }
    }

    /**
     *
     * @return the length of the list
     */
    public int length(){
        int counter =0;
        Node n = head;
        while(n!=null){
            counter++;
            n = n.next;
        }
        return counter;
    }

    /**
     * @return TRUE if list is empty, else FALSE
     */
    public boolean isEmpty(){
        return length() == 0;
    }

    /**
     * @return TRUE if list contains only 1 Element, else FALSE
     */
    public boolean hasOneElement(){
        return length() == 1;
    }

}