package aufgaben.sortieren;

public class BubbleSort extends A_Sortieren {

    @Override
    public void sort(int[] list){
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < list.length - 1; i++) {
                if(list[i]>list[i+1]){
                    swap(list,i,i+1);
                    b = true;
                    break;
                }
            }
        }
    }

    private void swap(int[] list, int src, int dest){
        int cache = list[src];
        list[src] = list[dest];
        list[dest] = cache;
    }

}
