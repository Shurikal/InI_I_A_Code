package aufgaben.sortieren;

public class StraightSelection extends A_Sortieren {

    @Override
    void sort(int[] list) {
        for(int i = 0; i<list.length-1; i++){
            int index = i;
            for(int j = i+1;j<list.length;j++){
                if(list[j]<list[index]){
                    index = j;
                }
            }
            swap(list,index,i);
        }
    }

    private void swap(int[] list, int src, int dest){
        int cache = list[src];
        list[src] = list[dest];
        list[dest] = cache;
    }
}
