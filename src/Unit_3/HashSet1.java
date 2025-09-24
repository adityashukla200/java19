package Unit_3;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();   //stores unique values
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String product = sc.next();
            hs.add(product);
            System.out.println(hs.size());
        }
    }
}
