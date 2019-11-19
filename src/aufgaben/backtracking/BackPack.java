package aufgaben.backtracking;

import java.util.ArrayList;
import java.util.Stack;

public class BackPack {
    final static int[] weight = new int[] { 5, 10, 13, 7, 8, 2, 9, 12, 17 };
    final static int[] value = new int[] { 3, 1, 4, 1, 5, 9, 2, 6, 5 };

    final int maxWeight = 30;

    private Stack<Integer> backPack;

    private ArrayList<Stack<Integer>> bags;
    private int counter=0;

    public static void main(String[] args){
        BackPack bp = new BackPack();
    }

    public BackPack(){
        bags = new ArrayList<>();
        backPack = new Stack<>();

        for(int i = 0; i < weight.length;i++){
            test(i,backPack);
            backPack.clear();
        }

        //Check valid bags
        int old_value = 0;
        Stack<Integer> most_value= new Stack<>();
        for(Stack<Integer> backs : bags){
            int new_value =0 ;
            for(int x : backs){
                new_value += value[x];
            }
            if(old_value < new_value){
                most_value = backs;
                old_value = new_value;
            }
        }

        System.out.println(old_value);
        System.out.print("Index: [");
        most_value.forEach(integer -> System.out.print(" "+ weight[integer]));
        System.out.println(" ]");
    }

    //Backpack erstes Element hinzufuegen
    //testen ob voll
    //Backpack zweites Element
    public void test(int index, Stack<Integer> bp){
        bp.add(index);
        if(b_check(bp)){
            bags.add((Stack<Integer>) bp.clone());
            for(int i =index+1; i < weight.length;i++){
                test(i,(Stack<Integer>) bp.clone());
            }
        }else{
            bp.pop();
        }
    }

    public boolean b_check(Stack<Integer> bp){
        int cache = 0;
        for(int x : bp){
            cache += weight[x];
        }
        return cache <= maxWeight;
    }

}
