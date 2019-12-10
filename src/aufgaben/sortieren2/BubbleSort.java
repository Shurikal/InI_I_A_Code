package aufgaben.sortieren2;

public class BubbleSort<E extends Comparable<E>> implements Sort<E> {


    private void swap(E[] list, int src, int dest){
        E cache = list[src];
        list[src] = list[dest];
        list[dest] = cache;
    }

    @Override
    public void sort(E[] collection) {
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < collection.length - 1; i++) {
                if(collection[i].compareTo(collection[i+1]) > 0){
                    swap(collection,i,i+1);
                    b = true;
                    break;
                }
            }
        }
    }
}
