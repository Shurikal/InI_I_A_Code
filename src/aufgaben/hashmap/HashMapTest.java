package aufgaben.hashmap;

public class HashMapTest {
    public static void main(String args[]) {
        HashMap<String, String> map = new HashMap<String, String>(10);
        System.out.println("Creating phone book...");
        map.insert("Arthur Dent", "+1 23 456 78 90");
        map.insert("Arthur Dent", "+1 23 456 78 99");
        map.insert("Ford Prefect", "+2 34 567 89 01");
        map.insert("Zaphod Beeblebrox", "+3 45 678 90 12");
        map.insert("Marvin the Paranoid Android", "+4 56 789 01 23");
        map.insert("Trillian", "+5 67 890 12 34");
        map.insert("Slartibartfast", "+6 78 901 23 45");
        map.insert("Zarniwoop", "+7 89 012 34 56");
        map.insert("Roosta", "+8 90 123 45 67");
        map.insert("Garkbit", "+9 01 234 56 78");
        map.insert("Deep Thought", "42");

        System.out.println(map.count("Arthur Dent"));

        map.findAll("Arthur Dent").forEach(e-> System.out.println(e));

        System.out.println("Looking up phone number of Arthur Dent: " + map.find("Arthur Dent"));
        System.out.println("Looking up phone number of Roosta: " + map.find("Roosta"));
    }
}
