public class Register {

    public Register(int i){
        m_data = new Object[i];
    }

    public boolean push(Object o){
        if(this.isFull()){
            return false;
        }
        m_data[counter] = o;
        counter++;
        return true;
    }

    public Object get(){
        if(this.isEmpty()){
            return null;
        }
        Object o = m_data[0];
        for(int i = 0; i < counter-1;i++) {
            m_data[i] = m_data[i + 1];
        }
        counter--;
        return o;
    }

    public int size(){
        return counter;
    }

    public boolean isEmpty(){
        return counter == 0;
    }

    public boolean isFull(){
        return counter == m_data.length;
    }


    private Object[] m_data;
    private int counter;
}
