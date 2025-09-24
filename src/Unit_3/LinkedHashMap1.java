package Unit_3;

import java.io.*;
import java.util.*;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String name = sc.next();
            int marks = sc.nextInt();
            hm.put(name,marks);

        }
//        for(Map.Entry m:hm.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//
//        }
        for(String st: hm.keySet()){   //key ka type pata hona chahiye
            System.out.println(st+" "+hm.get(st));
        }
    }
}