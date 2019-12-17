package aufgaben.tree;

public class IntegerTreeWithDummy {
    public int      value;
    public IntegerTreeWithDummy left;
    public IntegerTreeWithDummy right;

    public IntegerTreeWithDummy(int i){
        left = new IntegerDummy();
        right = new IntegerDummy();
        value = i;
    }

    public IntegerTreeWithDummy(){
        value = 0;
    }

    public int sumValues(){
        return value + right.sumValues()+ left.sumValues();
    }

    public int maxValue(){
        if(left instanceof IntegerDummy && right instanceof IntegerDummy){
            return value;
        }
        else if(left instanceof IntegerDummy){
            return Math.max(value, right.maxValue());
        }
        else if(right instanceof IntegerDummy){
            return Math.max(value, left.maxValue());
        }
        else{
            return Math.max(value,(Math.max(left.maxValue(),right.maxValue())));
        }
    }

    public int weight(){
        return 1+right.weight()+left.weight();
    }

    public int depth(){
        return 1+Math.max(right.depth(),left.depth());
    }
}
