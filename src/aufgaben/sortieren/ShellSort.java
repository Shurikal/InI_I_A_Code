package aufgaben.sortieren;

public class ShellSort extends A_Sortieren {
    @Override
    void sort(int[] a) {
        int[] gaps = {701, 301, 132, 57, 23, 10, 4, 1};
        int temp;
        int j;
        for(int gap : gaps) {
              for (int i = gap; i < a.length; i += 1) {
                temp = a[i];
                for (j = i; j >= gap && a[j - gap] > temp; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
        }
    }
}
