package aufgaben.linkedlist;

public class ListStackTest {

    public static void main(String[] args){
        ListStack<Integer> list = new ListStack<>();
        list.push(12);
        list.push(13);
        list.push(14);
        list.push(15);
        ListStack<String> stringlist = new ListStack<>();
        System.out.println(list.size());

        while(!list.isEmpty()){
            System.out.println(list.pop().data);
        }
    }
}
