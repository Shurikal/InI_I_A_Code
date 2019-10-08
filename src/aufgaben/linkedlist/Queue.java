package aufgaben.linkedlist;

public class Queue<E> {
    private DoublyLinkedList<E> dll;

    public Queue(){
        dll = new DoublyLinkedList<>();
    }

    public void enqueue(E e){
        dll.insertFront(e);
    }

    public E dequeue(){
        if(isEmpty()){
            return null;
        }
        E cache = dll.rear();
        dll.removeRear();
        return cache;
    }

    public int size(){
        return dll.size();
    }

    public boolean isEmpty(){
        return dll.isEmpty();
    }
}
