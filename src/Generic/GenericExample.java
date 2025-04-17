package Generic;

class MyGeneric<I> {
    I obj; // I là generic type parameter nó là tham số tổng quát

    void add(I obj) {
        this.obj = obj;
    }

    I get() {
        return obj;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        // use Integer
        MyGeneric<Integer> m1 = new MyGeneric<Integer>();
        m1.add(2);
        System.out.println(m1.get());

        // use String
        MyGeneric<String> m2 = new MyGeneric<String>();
        m2.add("Hello");
        System.out.println(m2.get());
    }
}
/*

public class H<K extends Person, V> {
    private K key;
    private V value;

    public H(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void showInfo() {
        System.out.println("Key: " + key.getName() + ", Value: " + value);
    }
}
*/

