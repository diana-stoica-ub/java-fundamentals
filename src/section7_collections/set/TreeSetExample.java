package section7_collections.set;


import section7_collections.list.NumberComparator;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String args[]) {
        // create a hash set
        Set<String> hs = new TreeSet<>();       //we can pass a comparator as a param

        // add elements to the hash set
        hs.add("X");
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");

        //elements are ordered
        System.out.println(hs);

        Set<Integer> hsInts = new TreeSet<>(new NumberComparator());
        hsInts.add(10);
        hsInts.add(2);
        hsInts.add(5);
        System.out.println(hsInts);
    }
}
