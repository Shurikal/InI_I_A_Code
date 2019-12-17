package aufgaben.tree;

public class IntegerTreeTest {

    public static void main(String[] args) {
        IntegerTree tree = new IntegerTree(3);
        // nur ein Element:
        System.out.println("Nur Root-Node:");
        System.out.println("a) Summe   = "+tree.sumValues());
        System.out.println("b) Maximum = "+tree.maxValue());
        System.out.println("c) Gewicht = "+tree.weight());
        System.out.println("d) Tiefe   = "+tree.depth());

        IntegerTree n1 = new IntegerTree(1);
        tree.left = n1;
        // nur ein Child-Element: 
        System.out.println("Ein Child-Node:");
        System.out.println("a) Summe   = "+tree.sumValues());
        System.out.println("b) Maximum = "+tree.maxValue());
        System.out.println("c) Gewicht = "+tree.weight());
        System.out.println("d) Tiefe   = "+tree.depth());

        IntegerTree n2 = new IntegerTree(4);
        tree.right = n2;
        // zweites Child-Element, Tiefe gleich: 
        System.out.println("Zwei Child-Nodes:");
        System.out.println("a) Summe   = "+tree.sumValues());
        System.out.println("b) Maximum = "+tree.maxValue());
        System.out.println("c) Gewicht = "+tree.weight());
        System.out.println("d) Tiefe   = "+tree.depth());

        IntegerTree n3 = new IntegerTree(1);
        n2.left = n3;
        IntegerTree n4 = new IntegerTree(5);
        n2.right = n4;
        IntegerTree n5 = new IntegerTree(9);
        n4.right = n5;
        System.out.println("Tiefe 4, Gewicht 6:");
        System.out.println("a) Summe   = "+tree.sumValues());
        System.out.println("b) Maximum = "+tree.maxValue());
        System.out.println("c) Gewicht = "+tree.weight());
        System.out.println("d) Tiefe   = "+tree.depth());
    }
}