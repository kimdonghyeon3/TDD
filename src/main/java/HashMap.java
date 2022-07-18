import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashMap<K, V> {

    private Object[] keys;
    private Object[] datas;
    private int index = 0;

    public HashMap() {
        this.keys = new Object[0];
        this.datas = new Object[0];
    }

    public void put(K key, V value) {

        int idx = foundIndex(key);

        if(idx != -1){
            datas[idx] = value;
            return;
        }

        expandIndex();
        keys[index] = key;
        datas[index] = value;
        index++;


    }

    public void expandIndex(){
        if(index >= keys.length){
            Object[] newKeys = new Object[keys.length + 1];
            Object[] newDatas = new Object[keys.length + 1];
            for(int i = 0 ; i < index ; i++){
                newKeys[i] = keys[i];
                newDatas[i] = datas[i];
            }

            keys = newKeys;
            datas = newDatas;
        }
    }

    public V get(K key) {

        int idx = foundIndex(key);

        return (V) datas[idx];
    }

    private int foundIndex(K key) {
        for(int i = 0 ; i < index ; i++){

            System.out.println("keys[" + i + "] = " + keys[i]);
            if(keys[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return index;
    }

    public void remove(K key) {



        int idx = foundIndex(key);
        System.out.println("idx = " + idx);
        System.out.println("key = " + key);
        if(idx != -1){
            for(int i = idx + 1 ; i < keys.length ; i++){
                keys[i-1] = keys[i];
                datas[i-1] = datas[i];
            }
            index--;
        }
    }

    Set<K> keySet() {
        Set<K> keySet = new HashSet<>();

        for ( int i = 0; i < index; i++ ) {
            keySet.add((K)keys[i]);
        }
        return keySet;
    }
}
