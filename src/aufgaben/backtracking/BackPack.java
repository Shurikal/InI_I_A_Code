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
        //new BackPack().fill(0);
        BackPack bp = new BackPack();
        for(int i = 0; i < weight.length;i++){
            bp.test(i);
            System.out.println("");
        }
    }

    public BackPack(){
        bags = new ArrayList<>();
        backPack = new Stack<>();
    }

    //Backpack erstes Element hinzufuegen
    //testen ob voll
    //Backpack zweites Element
    public void test(int index){
        backPack.add(index);
        if(b_check()){
            bags.add((Stack<Integer>) backPack.clone());
            for(int i =index+1; i < weight.length;i++){
                test(i);
                System.out.println("....");
            }
        }else{
            backPack.pop();
            System.out.println("Ende erreicht");
        }

    }

    public int check(Stack<Integer> args){
        int cache = 0;
        for (int arg : args) {
            cache += weight[arg];
        }
        return cache;
    }

    public boolean b_check(){
        int cache = 0;

        for(int x : backPack){
            System.out.println("Weight in backpack: " + weight[x]);
            cache += weight[x];
        }
        System.out.println("Current Weight: " +cache);
        return cache <= maxWeight;
    }

    public void fill(){
        for(int index = 0; index < weight.length;index++){

            if(!backPack.isEmpty()){
                backPack.clear();
                System.out.println(backPack.size());
            }

            //Add first item
            backPack.add(index);
            System.out.println("Index :" + index);
            //Check if over maximum weight
            if(b_check()){
                bags.add((Stack<Integer>) backPack.clone());
                //Add next item
                for(int i = index+1; i< weight.length; i++){
                    backPack.add(i);
                    System.out.println("I : " + i);

                    if(b_check()){
                        bags.add((Stack<Integer>) backPack.clone());
                    }else{
                        System.out.println(backPack.pop()+ " : wurde gelöscht");
                    }

                }
            }
        }
    }

}
