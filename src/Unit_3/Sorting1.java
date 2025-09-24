package Unit_3;

import java.util.*;
import java.util.Collections;

public class Sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(23);
        al.add(42);
        al.add(10);
        al.add(5);
        al.add(6);
//        Collections.sort(al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);

    }
}
