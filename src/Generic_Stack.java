import java.lang.reflect.Array;

public class Generic_Stack<T> {

    /**
     * Example: Generic_Stack<Integer> s = new Generic_Stack<>(Integer.class,10);
     * @param t Class of the Stack, example: Integer.class
     * @param size maximum size of the stack
     */
    public Generic_Stack(Class<T> t,int size){
        final T[] m_data =  (T[]) Array.newInstance(t,size);
        this.m_data = m_data;
        counter = 0;
    }

    /**
     * Adds an object on top of the stack
     * @param t, object to push into the stack
     * @return true it was possible to push, false if stack is full
     */
    public boolean push(T t){
        if(this.isFull()){
            return false;
        }
        m_data[counter] = t;
        counter++;
        return true;
    }

    /**
     * Returns the object on top of the stack and removes it from the stack
     * @return the object if stack wasn't empty, null if stack was empty
     */
    public T pop(){
        if(this.isEmpty()){
            return null;
        }
        T t = m_data[counter-1];
        m_data[counter-1] = null;
        counter--;
        return t;
    }

    /**
     * Returns the object on top of the stack
     * @return the object if stack wasn't empty, null if stack was empty
     */
    public T top(){
        return m_data[counter-1];
    }

    /**
     *
     * @return the size of the current stack
     */
    public int size(){
        return counter;
    }

    /**
     *
     * @return true if stack is empty
     */
    public boolean isEmpty(){
        return counter == 0;
    }

    /**
     * @return true if stack is full
     */
    public boolean isFull(){
        return counter == m_data.length;
    }

    private T[] m_data;
    private int counter;
}
