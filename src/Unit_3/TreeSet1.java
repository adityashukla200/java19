package Unit_3;

import java.util.SortedSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        SortedSet<Integer> ts = new TreeSet<>();    //sorted in increasing order by default
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            ts.add(sc.nextInt());
        }
        System.out.println(ts);
        System.out.println(ts.subSet(2,5));
        System.out.println(ts.contains(5));

    }
}
