package aufgaben.hashmap;

public class KeyNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public KeyNotFoundException() {
        super("Key not found!");
    }
}

