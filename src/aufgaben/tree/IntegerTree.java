package aufgaben.tree;

public class IntegerTree {
    public int      value;
    public IntegerTree left;
    public IntegerTree right;

    public IntegerTree(int i){
        left = null;
        right = null;
        value = i;
    }


    public int sumValues(){
        if(left == null && right ==null){
            return value;
        }
        else if(left == null){
            return value + right.sumValues();
        }
        else if(right == null){
            return value + left.sumValues();
        }
        else{
            return value + right.sumValues()+ left.sumValues();
        }
   }

    public int maxValue(){
        if(left == null && right ==null){
            return value;
        }
        else if(left == null){
            return Math.max(value, right.maxValue());
        }
        else if(right == null){
            return Math.max(value, left.maxValue());
        }
        else{
            return Math.max(value,(Math.max(left.maxValue(),right.maxValue())));
        }
    }

    public int weight(){
        if(left == null && right ==null){
            return 1;
        }
        else if(left == null){
            return 1+right.weight();
        }
        else if(right == null){
            return 1+left.weight();
        }
        else{
            return 1+right.weight()+left.weight();
        }
    }

    public int depth(){
        if(left == null && right ==null){
            return 1;
        }
        else if(left == null){
            return 1+right.depth();
        }
        else if(right == null){
            return 1+left.depth();
        }
        else{
            return 1+Math.max(right.depth(),left.depth());
        }
    }
}
