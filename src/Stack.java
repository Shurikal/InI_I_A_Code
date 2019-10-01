public class Stack {

    /**
     *
     * @param size maximum size of the stack
     */
    public Stack(int size){
        m_data = new Object[size];
        counter = 0;
    }

    /**
     * Adds an object on top of the stack
     * @param o, object to push into the stack
     * @return true it was possible to push, false if stack is full
     */
    public boolean push(Object o){
        if(this.isFull()){
            return false;
        }
        m_data[counter] = o;
        counter++;
        return true;
    }

    /**
     * Returns the object on top of the stack and removes it from the stack
     * @return the object if stack wasn't empty, null if stack was empty
     */
    public Object pop(){
        if(this.isEmpty()){
            return null;
        }
        Object o = m_data[counter-1];
        m_data[counter-1] = null;
        counter--;
        return o;
    }

    /**
     * Returns the object on top of the stack
     * @return the object if stack wasn't empty, null if stack was empty
     */
    public Object top(){
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

    private Object[] m_data;
    private int counter;
}
