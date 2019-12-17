package aufgaben.tree;

public class IntegerTreeTestDummy {

    public static void main(String[] args) {
        IntegerTreeWithDummy tree = new IntegerTreeWithDummy(3);
        // nur ein Element:
        System.out.println("Nur Root-Node:");
        System.out.println("a) Summe   = "+tree.sumValues());
        System.out.println("b) Maximum = "+tree.maxValue());
        System.out.println("c) Gewicht = "+tree.weight());
        System.out.println("d) Tiefe   = "+tree.depth());

        IntegerTreeWithDummy n1 = new IntegerTreeWithDummy(1);
        tree.left = n1;
        // nur ein Child-Element:
        System.out.println("Ein Child-Node:");
        System.out.println("a) Summe   = "+tree.sumValues());
        System.out.println("b) Maximum = "+tree.maxValue());
        System.out.println("c) Gewicht = "+tree.weight());
        System.out.println("d) Tiefe   = "+tree.depth());

        IntegerTreeWithDummy n2 = new IntegerTreeWithDummy(4);
        tree.right = n2;
        // zweites Child-Element, Tiefe gleich:
        System.out.println("Zwei Child-Nodes:");
        System.out.println("a) Summe   = "+tree.sumValues());
        System.out.println("b) Maximum = "+tree.maxValue());
        System.out.println("c) Gewicht = "+tree.weight());
        System.out.println("d) Tiefe   = "+tree.depth());

        IntegerTreeWithDummy n3 = new IntegerTreeWithDummy(1);
        n2.left = n3;
        IntegerTreeWithDummy n4 = new IntegerTreeWithDummy(5);
        n2.right = n4;
        IntegerTreeWithDummy n5 = new IntegerTreeWithDummy(9);
        n4.right = n5;
        System.out.println("Tiefe 4, Gewicht 6:");
        System.out.println("a) Summe   = "+tree.sumValues());
        System.out.println("b) Maximum = "+tree.maxValue());
        System.out.println("c) Gewicht = "+tree.weight());
        System.out.println("d) Tiefe   = "+tree.depth());
    }
}