package aufgaben.sortieren;

public class StraightInsertion extends A_Sortieren {

    @Override
    void sort(int[] a) {
        int i = 1;

        while(i < a.length) {
            int x = a[i];
            int j = i - 1;

            while(j >= 0 && a[j] > x){
                a[j+1] =a[j];
                j = j - 1;
            }
            a[j + 1] = x;
            i = i + 1;
        }
    }
}
