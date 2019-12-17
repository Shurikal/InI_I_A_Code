package aufgaben.sortieren2;

import java.util.Arrays;

public class HeapSort<E extends Comparable<E>> implements Sort<E>  {

    @Override
    public void sort(E[] collection) {

    }

    private void heapifiy(E[] collection, int end){

    }

    private void maxHeapifiy(E[] collection, int i, int end){
        int index, leftChild, righChild;

        while(i < end) {
            index = i;

            leftChild = 2*i + 1;
            righChild = leftChild + 1;

            if (leftChild < end && collection[leftChild].compareTo(collection[index]) >0 ) {
                index = leftChild;
            }

            if (righChild < end && collection[righChild].compareTo(collection[index]) > 0) {
                index = righChild;
            }

            if (index == i) {
                return;
            }

            swap(collection,i, index);

            i = index;
        }
    }

    private void swap(E[] list, int src, int dest){
        E cache = list[src];
        list[src] = list[dest];
        list[dest] = cache;
    }

}
