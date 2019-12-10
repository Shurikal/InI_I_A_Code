package aufgaben.sortieren2;

public class SortTest {
    public static void main(String[] args) {
        Integer[] list = {1,5,3,2,4};
        test(list,new BubbleSort());
    }

    public static <E extends Comparable<E>> void test(E[] list, Sort algo){
        algo.sort(list);
        int  b = -1;
        for(int i = 0; i< list.length-1 && b <= 0;i++){
            b = list[i].compareTo(list[i+1]);
        }
        if(b <= 0) {
            System.out.println("Test bestanden");

        }else{
            System.out.println("Test nicht bestanden");
        }
    }
}
