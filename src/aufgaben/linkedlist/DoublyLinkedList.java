package aufgaben.linkedlist;

public class DoublyLinkedList<E> {

    private Node head,tail;
    private int size;

    public DoublyLinkedList(){
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void clear(){
        head = null;
        tail = null;
    }

    public E front(){
        if(!isEmpty()) {
            return tail.data;
        }
        return null;
    }

    public E rear(){
        if(!isEmpty()) {
            return head.data;
        }
        return null;
    }

    public void insertFront(E e){
        size++;
        if(isEmpty()){
            tail = new Node(e);
            head = tail;
            return;
        }
        tail.prev = new Node(e);
        tail.prev.next = tail;
        tail = tail.prev;
    }

    public void insertRear(E e){
        size++;
        if(isEmpty()){
            head = new Node(e);
            tail = head;
            return;
        }
        head.next = new Node(e);
        head.next.prev = head;
        head = head.next;
    }

    public void removeFront(){
        if(isEmpty()){
            return;
        }
        size--;
        if(tail.next == null){      //Nur ein Element?
            head = null;
            tail = null;
            return;
        }
        tail = tail.next;
        tail.prev = null;
    }

    public void removeRear(){
        if(isEmpty()){                  //Leere Liste?
            return;
        }
        size--;
        if(head.prev == null){          //Nur ein Element?
            tail = null;
            head = null;
            return;
        }
        head = head.prev;
        head.next = null;
    }

    public boolean insertAfter(E existing, E n){
        Node cache = tail;
        while(cache.next != null && !cache.data.equals(existing)){      //Durchsucht Liste nach gleichem Element, fängt bei Tail an
            cache = cache.next;
        }
        if(cache.data.equals(existing)){                                //Wenn gefundenes Element Head ist
            if(cache.next ==null){
                insertFront(n);
                return true;
            }
            Node cache1 = cache.next;                                   //Element in Liste
            Node neu = new Node(n);
            cache.next = neu;
            cache1.prev = neu;
            neu.prev = cache;
            neu.next = cache1;
            size++;
            return true;
        }
        return false;
    }

    public boolean remove(E existing){
        Node cache = tail;
        while(cache.next != null && !cache.data.equals(existing)){      //Durchsucht Liste nach gleichem Element, fängt bei Tail an
            cache = cache.next;
        }
        if(cache.data.equals(existing)){                                //Element gefunden?
            if(cache.prev == null){                                     //Element bei Tail
                removeRear();
                return true;
            }
            if(cache.next == null){                                     //Element bei Head
                removeFront();
                return true;
            }
            Node cachePrev = cache.prev;                                //Element in Liste
            Node cacheNext = cache.next;
            cache.prev.next = cacheNext;
            cache.next.prev = cachePrev;
            return true;
        }
        return false;
    }

    private class Node{
        Node prev;
        Node next;
        E data;

        private Node(E data){
            this.data = data;
        }

    }

}
