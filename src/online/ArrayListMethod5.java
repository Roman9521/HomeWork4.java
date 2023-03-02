package online;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Tom");
        arrayList.add("Bob");
        arrayList.add("Mariya");
        arrayList.add("Vova");
        arrayList.add("Elena");

        List<Integer> list1 = List.of(3,8,13);
        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList);
        System.out.println(list2);
//        System.out.println("ArrayList = " + arrayList);
//        Object[] array = arrayList.toArray();
//        String[] array2 = arrayList.toArray(new String[0]);
//
//        for (String x :
//                array2) {
//            System.out.println(x);
//        }

//        List<String> myList = arrayList.subList(1,4);
//        System.out.println("SubList = " + myList);
//        myList.add("Fedor");
//        System.out.println("Sublist = " + myList);
//        System.out.println("ArrayList = " + arrayList);
//        arrayList.add("Sveta");
//        System.out.println(arrayList);


//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Bob");
//        arrayList2.add("Vova");
//        arrayList2.add("Igor");
//
////        arrayList.retainAll(arrayList2);
////        System.out.println(arrayList);
//
//        boolean result = arrayList.containsAll(arrayList2);
//        System.out.println(result);
    }
}
