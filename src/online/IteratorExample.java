package online;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Tom");
        arrayList.add("Bob");
        arrayList.add("Mariya");
        arrayList.add("Vova");
        arrayList.add("Elena");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList);

    }
}
