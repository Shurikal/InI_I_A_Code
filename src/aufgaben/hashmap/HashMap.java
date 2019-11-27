package aufgaben.hashmap;

import java.util.ArrayList;

public class HashMap<Key, Value> {
    private Entry<Key, Value>[] m_table;
    private int m_size;

    public HashMap(int size) {
        m_table = (Entry<Key, Value>[]) new Entry[size];
        for (int i = 0; i < m_table.length; ++i) {
            m_table[i] = new Entry<>();
            m_table[i].occupied = false;
        }
        m_size = 0;
    }

    public boolean contains(Key key) {
        int i = index(key);
        return key.equals(m_table[i].key);
    }

    public Value find(Key key) throws KeyNotFoundException {
        int i = index(key);
        if (key == m_table[i].key) {
            return m_table[i].value;
        } else {
            throw new KeyNotFoundException();
        }
    }

    public boolean insert(Key key, Value value) {
        if (m_size == m_table.length) {
            return false;
        }

        int i = index(key);
        Entry e =m_table[i];

        if(e!=null && e.occupied){
            while(e.next!=null && e.next.occupied){
                e = e.next;
            }
            e.next = new Entry();
            e.next.key = key;
            e.next.value = value;
            e.next.occupied = true;

            return true;
        }

        e.key = key;
        e.value = value;
        e.occupied = true;
        return true;
    }

    private int index(Key key) {
        int k = 0;
        int i = Math.floorMod(key.hashCode(), m_table.length);
        while (m_table[i].occupied && !key.equals(m_table[i].key)) {
            i = (i+(k*k)) % m_table.length; // quadr. Sondierungsfunktion
            k++;
        }
        return i;
    }

    public int count(Key key){
        int count = 0;
        int i = index(key);

        Entry e =m_table[i];

        if(e!=null && e.occupied){
            count++;
            while(e.next!=null && e.next.occupied){
                e = e.next;
                count++;
            }
        }
        return count;
    }

    public ArrayList<Value> findAll(Key key){
        ArrayList<Value> al = new ArrayList<>();
        int i = index(key);
        Entry e =m_table[i];
        if(e!=null && e.occupied){
            al.add((Value)e.value);
            while(e.next!=null && e.next.occupied){
                e = e.next;
                al.add((Value)e.value);
            }
        }
        return al;
    }

    private static class Entry<K, V> {
        K key;
        V value;
        boolean occupied;
        Entry<K,V> next=null;
    }

}