package aufgaben.linkedlist;

public class ListStack<E> {

    private Node root;
    private int size = 0;

    public ListStack(){
    }

    public boolean push(final E element){
        size++;
        if(root==null){
            root = new Node();
            root.data = element;
            return true;
        }
        Node cache;
        cache = root;
        while(cache.next!=null){
            cache = cache.next;
        }
        cache.next = new Node();
        cache.next.data = element;
        return true;
    }

    public E pop(){
        if(root== null){
            return null;
        }
        size--;
        Node cache = root;
        if(cache.next==null){
            root = null;
            return cache.data;
        }
        while(cache.next.next!=null){
          cache = cache.next;
        }
        Node c = cache.next;
        cache.next = null;
        return c.data;
    }

    public E top(){
        Node cache;
        cache = root;
        while(cache.next!=null){
            cache = cache.next;
        }
        return cache.data;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return root==null;
    }

    private class Node{
        E data;
        Node next;
    }

}


