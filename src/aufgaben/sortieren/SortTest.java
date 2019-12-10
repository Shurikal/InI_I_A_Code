package aufgaben.sortieren;

import java.util.Arrays;
import java.util.Random;

public class SortTest {

    public static void main(String[] args) {
        int a = 0;

        int[] list = new int[10];
        Random r = new Random();

        for(int i = 0; i<list.length;i++){
            list[i] = r.nextInt(200);
        }

        Arrays.stream(list).forEach(System.out::println);
        System.out.println("######################");
        new ShellSort().sort(list);

        Arrays.stream(list).forEach(System.out::println);
        System.out.println("######################");
    }
}
