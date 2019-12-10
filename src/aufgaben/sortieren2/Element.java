package aufgaben.sortieren2;

public class Element implements Comparable<Element> {

    int data;

    @Override
    public int compareTo(Element o) {
        return this.data-o.data;
    }
}
